package com.example.Userbackend;




import com.example.Userbackend.model.User;

import com.example.Userbackend.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserBackendApplication.class, args);
	}

	@Autowired
    UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception{
		userRepo.save(new User("Blaine", "Young", "Blaine.young3553@gmail.com"));
		userRepo.save(new User("Jacob", "Mitchell", "Jmitchell@gmail.com"));
		userRepo.save(new User("Toni", "Patterson", "Toni@gmail.com"));
		userRepo.save(new User("Brenda", "Young", "beyoung@bellsouth.net"));
	}

}
