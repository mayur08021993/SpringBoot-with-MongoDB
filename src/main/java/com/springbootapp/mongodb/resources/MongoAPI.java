package com.springbootapp.mongodb.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapp.mongodb.document.User;
import com.springbootapp.mongodb.reposistory.UserRepository;

@RestController
@RequestMapping("/mongo/users")
public class MongoAPI {
	
	@Autowired
	private UserRepository userRepo;
	
	
	@RequestMapping("/all")
	public List<User> getAllUsers(){
		return  userRepo.findAll();
	}
	
	@RequestMapping("/add/{id}/{name}")
	public User addUser(@PathVariable("name") String name,@PathVariable("id") String id){
		return  userRepo.save(new User(Integer.valueOf(id), name ));
	}
	
	

}
