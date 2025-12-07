package com.todoapp.smarttodo.service;

import com.todoapp.smarttodo.model.Task;
import com.todoapp.smarttodo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRespository;

    public Task registerTask(Task Task){
        return taskRespository.save(Task);
    }

    public Optional<Task> findTaskByTaskId(Long id){
        return taskRespository.findById(id); // we need to convert id to int value and findBy will return
        // a type of Optional.
    }

    public Optional<Task> findTaskByTaskTitle(String TaskName){
        return taskRespository.findTaskByTaskName(TaskName);
       /* find (or get, read, query, etc.): The starting action keyword.
        By: The delimiter that indicates the start of the criteria (the WHERE clause).
                TaskName: This must be the exact name of the field in your Task entity, using CamelCase conventions.
        Once you declare this method and your application context is set up correctly,
        Spring Data JPA will create the implementation for you,
        and your code line: return TaskRepository.findByTaskName(TaskName);
        will execute the query successfully.
    */
    }

    public void deleteTaskById(Long id){
        taskRespository.deleteById(id);
    }

    public Task updateTask(Task Task){
        return taskRespository.save(Task);
    }
}
