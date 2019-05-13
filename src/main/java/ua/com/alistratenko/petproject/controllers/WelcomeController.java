package ua.com.alistratenko.petproject.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.alistratenko.petproject.repositories.UserRepository;

import java.util.Set;

@Controller()
@Log4j2
public class WelcomeController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping("/")
	public String welcome(Model model){

		Set<String> collectionNames = mongoTemplate.getCollectionNames();

		log.error(collectionNames);
		model.addAttribute("users", collectionNames);

		return "welcome";
	}
}
