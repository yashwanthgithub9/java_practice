package com.Employee_Service.Service;

import com.Employee_Service.Client.APIClient;
import com.Employee_Service.DTO.DepartmentDTO;
import com.Employee_Service.DTO.EmployeeDTO;
//import com.project.EmployeeMgt.Entity.Department;
import com.Employee_Service.Entity.Employee;
//import com.project.EmployeeMgt.Repository.DepartmentRepository;
import com.Employee_Service.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private APIClient apiClient;

//    @Autowired
//    private DepartmentRepository departmentRepository;
    @Transactional
    public Employee createEmployee(EmployeeDTO employeeDTO){

        DepartmentDTO department=apiClient.getDepartmentByID(employeeDTO.getDepartmentId());
       /* Department dept = departmentRepository.findById(employeeDTO.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department not found with ID: " + employeeDTO.getDepartmentId()));*/
        Employee employee = new Employee();
        employee.setEmpName(employeeDTO.getName());
        employee.setEmpMail(employeeDTO.getEmail());
        employee.setEmpSalary(employeeDTO.getSalary());
        employee.setDepartmentId(employeeDTO.getDepartmentId());

        Employee savedEmployee1= employeeRepository.save(employee);

        EmployeeDTO employeeDTO1=new EmployeeDTO();
        employeeDTO1.setName(savedEmployee1.getEmpName());
        employeeDTO1.setEmail(savedEmployee1.getEmpMail());
        employeeDTO1.setSalary(savedEmployee1.getEmpSalary());
        employeeDTO1.setDepartmentId(savedEmployee1.getDepartmentId());

        return savedEmployee1;

    }

/*    public List<Department> getDepartmentList(){
        return departmentRepository.findAllWithEmployees();
    }*/
//    @PutMapping("{id}")
    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO){
        Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee doesn't exist with id "+id+"please create"));
        existingEmployee.setEmpSalary(employeeDTO.getSalary());
        existingEmployee.setEmpName(employeeDTO.getName());
        existingEmployee.setEmpMail(employeeDTO.getEmail());

       /* if (employeeDTO.getDepartmentId()!=null){
            Department department=departmentRepository.findById(employeeDTO.getDepartmentId()).orElseThrow(()->new RuntimeException("Department not found"));
            existingEmployee.setDepartment(department);


        }*/
        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(long id){
        if (!employeeRepository.existsById(id)){
            throw new RuntimeException("Employee didn't found with id :"+id);
        }
        employeeRepository.deleteById(id);
    }

    public EmployeeDTO getEmployeeWithID(Long id){
    //public Optional<Employee> getEmployeeWithID(Long id){

        //By throwing exception we need to return type employee not Optional
        Employee employee= employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee with emp id not found"));

        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setName(employee.getEmpName());
        employeeDTO.setDepartmentId(employee.getDepartmentId());
        employeeDTO.setSalary(employee.getEmpSalary());
        employeeDTO.setEmail(employee.getEmpMail());
        employeeDTO.setName(employee.getEmpName());

        if (employee.getDepartmentId()!=null){
            DepartmentDTO departmentDTO=apiClient.getDepartmentByID(employee.getDepartmentId());
            employeeDTO.setDepartmentDTO(departmentDTO);
        }

        return employeeDTO;

    }


}
