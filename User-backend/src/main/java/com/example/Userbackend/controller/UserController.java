package com.example.Userbackend.controller;

import java.util.List;

import com.example.Userbackend.dao.UserRepository;
import com.example.Userbackend.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // simplify the creation of RESTful web services
@CrossOrigin(origins = "http://localhost:3000") //allows the server (localhost:8080) to communicate with the client (localhost:3000)
public class UserController {

    @Autowired //allows Spring to resolve and inject collaborating data into this bean(a object)
    UserRepository userRepo;
    
    @GetMapping("/api/users") //states that this function is ran on get requests to /api/users
    public List<User> listOfUsers(){
       return userRepo.findAll(); //return the list of users
    }

}
