package com.springbootapp.mongodb.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.springbootapp.mongodb.document.User;
import com.springbootapp.mongodb.reposistory.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses= UserRepository.class)
public class MongoDBConfig {

	public CommandLineRunner commandLineRunner(UserRepository userRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				userRepo.save(new User(1, "Mayur"));
				userRepo.save(new User(2, "Varad"));
			}
		};
	}
}
