package com.Employee_Service.Controller;

import com.Employee_Service.DTO.EmployeeDTO;
//import com.Employee_Service.Entity.Department;
import com.Employee_Service.Entity.Employee;
import com.Employee_Service.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<Employee> createEmployeeResponseEntity(@Valid @RequestBody EmployeeDTO employeeDTO){
//        Employee employee=new Employee();
        Employee employee=employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

/*    @GetMapping("/departments")
    public List<Department> getDepartmentList(){
        return employeeService.getDepartmentList();
    }*/

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployees(@PathVariable Long id){

        EmployeeDTO employee=employeeService.getEmployeeWithID(id);

        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployeeResponseEntity(@PathVariable Long id, @Valid @RequestBody EmployeeDTO employeeDTO){
        Employee employee = employeeService.updateEmployee(id,employeeDTO);

        return new ResponseEntity<>(employee,HttpStatus.FOUND);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeResponseEntity(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee with id :"+id+" deleted");
    }

    @GetMapping("/welcome")
    public String welcomeEmployee(){
        return "Welcome to employee endpoint";
    }
}
