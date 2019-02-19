package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class CrudAngularSpringH2Application implements CommandLineRunner {
	
	@Autowired
private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudAngularSpringH2Application.class, args);
	}

	//after the start of all the application this method will automatically run  
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one","one"));

		userRepository.save(new User("two","one"));

		userRepository.save(new User("three","one"));
		
	}

}
