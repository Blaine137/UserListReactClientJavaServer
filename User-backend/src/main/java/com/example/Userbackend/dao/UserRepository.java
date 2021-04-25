package com.example.Userbackend.dao;

import com.example.Userbackend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects
public interface UserRepository extends JpaRepository<User, Long>{
    
}
