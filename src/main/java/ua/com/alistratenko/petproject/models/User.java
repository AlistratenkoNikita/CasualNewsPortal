package ua.com.alistratenko.petproject.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
public class User {

	@Id
	private ObjectId _id;

	private String name;
	private Integer age;

	public User() {
	}

	public User(ObjectId _id, String name, Integer age) {
		this._id = _id;
		this.name = name;
		this.age = age;
	}
}
