package ua.com.alistratenko.petproject;

import com.mongodb.MongoClient;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@Autowired
	MongoTemplate mongoTemplate;

	@GetMapping("/")
	public String welcome(){
		for (Document user : mongoTemplate.getCollection("users").find()) {

		}
		return "welcome";
	}
}
