package edu.eci.springbootdatamongodb.service;

import edu.eci.springbootdatamongodb.dto.UserDto;
import edu.eci.springbootdatamongodb.model.User;

import java.util.List;

public interface UserService
{
    User create( User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}
