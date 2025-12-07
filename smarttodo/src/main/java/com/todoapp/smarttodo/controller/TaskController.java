package com.todoapp.smarttodo.controller;

import com.todoapp.smarttodo.repository.TaskRepository;
import com.todoapp.smarttodo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    public TaskService taskService;
}
