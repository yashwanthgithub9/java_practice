package com.project.EmployeeMgt.Controller;

import com.project.EmployeeMgt.DTO.EmployeeDTO;
import com.project.EmployeeMgt.Entity.Employee;
import com.project.EmployeeMgt.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployeeResponseEntity(@Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee=employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

}
