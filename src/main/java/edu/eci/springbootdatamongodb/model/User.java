package edu.eci.springbootdatamongodb.model;

import edu.eci.springbootdatamongodb.dto.UserDto;
import edu.eci.springbootdatamongodb.repository.UserDocument;

import java.util.Date;
import java.util.UUID;

public class User

{

    String id;

    String name;

    String email;

    String lastName;

    Date createdAt;


    public User( UserDto userDto )
    {
        id = UUID.randomUUID().toString();
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = new Date();
    }
    
    public User(UserDocument userDocument){
        this.id = userDocument.getId();
        this.name = userDocument.getName();
        this.lastName = userDocument.getLastName();
        this.email = userDocument.getEmail();
        this.createdAt = userDocument.getCreatedAt();
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void update( UserDto userDto )
    {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
    }
}
