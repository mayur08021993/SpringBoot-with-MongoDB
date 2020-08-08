package com.springbootapp.mongodb.reposistory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootapp.mongodb.document.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
