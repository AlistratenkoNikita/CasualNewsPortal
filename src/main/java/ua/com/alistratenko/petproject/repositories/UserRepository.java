package ua.com.alistratenko.petproject.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import ua.com.alistratenko.petproject.models.User;

public interface UserRepository extends MongoRepository<User, ObjectId> {
	User findBy_id(ObjectId _id);

	User findByName(String name);
}
