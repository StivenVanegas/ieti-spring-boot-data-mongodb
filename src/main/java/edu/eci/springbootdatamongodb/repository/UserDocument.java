package edu.eci.springbootdatamongodb.repository;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDocument {

    @Id
    String id;
    
    String name;
    
    @Indexed(unique = true)
    String email;
    
    String lastName;
    Date createdAt;
    
    public UserDocument(){
    }
}
