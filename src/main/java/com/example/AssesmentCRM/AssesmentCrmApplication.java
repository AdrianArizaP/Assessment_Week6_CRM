package com.example.AssesmentCRM;

import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssesmentCrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssesmentCrmApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		UserEntity user_entity = new UserEntity();
		user_entity.setUsername("Alberto");
		user_entity.setPassword("Alberto123");
		user_entity.setEmail("Alberto@solera.com");
		userRepository.save(user_entity);


	}
}
