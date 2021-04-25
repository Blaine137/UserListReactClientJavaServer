package com.example.Userbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //states that the User class will represent the User data in the database
@Table(name="users") //specifies the details of the table you would like to use. in this case use the users table in the database
public class User {
    
    @Id //sets the ID as the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //automatically generates the ID value
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    public User(){
        //default constructor
    }

        //constructor to set values
    public User(String firstName, String lastName, String email){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

        //GETTERS and SETTERS
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
