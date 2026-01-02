package com.Employee_Service.Exception;

//import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

// @RestControllerAdvice = "I am a global listener for all Controllers"
@RestControllerAdvice
public class GlobalExceptionHandler {

/*    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map<String,String>> handleSQLDulicates(DataIntegrityViolationException exception){

        Map<String,String> responce=new HashMap<>();
        responce.put("status","error");
        responce.put("message","Email already exists, try new email");

        return new ResponseEntity<>(responce, HttpStatus.BAD_REQUEST);
    }*/

}
