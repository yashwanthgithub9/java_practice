package com.todoapp.smarttodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ControllerClass {

    @GetMapping("/")
    public String SayHello(){
        return "HELLO FROM TO DO APP";
    }
}
