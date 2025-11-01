package com.todoapp.smarttodo.service;

import com.todoapp.smarttodo.model.User;
import com.todoapp.smarttodo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRespository userRespository;

    public User registerUser(User user){
        return userRespository.save(user);
    }

    public Optional<User> findUserById(Long id){
        return userRespository.findById(id.intValue()); // we need to convert id to int value and findBy will return
        // a type of Optional.
    }

    public Optional<User> findUserByUsername(String username){
        return userRespository.findByUsername(username);
       /* find (or get, read, query, etc.): The starting action keyword.
        By: The delimiter that indicates the start of the criteria (the WHERE clause).
                Username: This must be the exact name of the field in your User entity, using CamelCase conventions.
        Once you declare this method and your application context is set up correctly,
        Spring Data JPA will create the implementation for you,
        and your code line: return userRepository.findByUsername(username);
        will execute the query successfully.
    */
    }

    public void deleteUSerById(Long id){
        userRespository.deleteById(id.intValue());
    }

    public User updateUser(User user){
        return userRespository.save(user);
    }
}
