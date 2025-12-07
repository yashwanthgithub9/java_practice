package com.todoapp.smarttodo.repository;

import com.todoapp.smarttodo.model.Task;
import com.todoapp.smarttodo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRespository extends JpaRepository<User,Integer> {
//    Optional<Task> findByUserid(Integer taskInteger);
    Optional<User> findByName(String username);
}

