package com.project.EmployeeMgt.Service;

import com.project.EmployeeMgt.DTO.EmployeeDTO;
import com.project.EmployeeMgt.Entity.Department;
import com.project.EmployeeMgt.Entity.Employee;
import com.project.EmployeeMgt.Repository.DepartmentRepository;
import com.project.EmployeeMgt.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;
    @Transactional
    public Employee createEmployee(EmployeeDTO employeeDTO){

//        Department department=departmentRepository.findById(employeeDTO.getDepartmentId())
//                .orElseThrow(()->new RuntimeException("Department not found"));
        Department dept = departmentRepository.findById(employeeDTO.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department not found with ID: " + employeeDTO.getDepartmentId()));
        Employee employee = new Employee();
        employee.setEmpName(employeeDTO.getName());
        employee.setEmpMail(employeeDTO.getEmail());
        employee.setEmpSalary(employeeDTO.getSalary());
        employee.setDepartment(dept);

        return employeeRepository.save(employee);
    }

    public List<Department> getDepartmentList(){
        return departmentRepository.findAllWithEmployees();
    }
}
