package com.project.EmployeeMgt;

import com.project.EmployeeMgt.DTO.EmployeeDTO;
import com.project.EmployeeMgt.Entity.Department;
import com.project.EmployeeMgt.Entity.Employee;
import com.project.EmployeeMgt.Repository.DepartmentRepository;
import com.project.EmployeeMgt.Repository.EmployeeRepository;
import com.project.EmployeeMgt.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


// 1. Tell JUnit to enable the Mockito tools
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private DepartmentRepository departmentRepository;
    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void testAllGetDepartments(){
        // --- 1. PREPARE THE SCRIPT (Given) ---
        // We create a "fake" department to use as data
        Department department=new Department();
        department.setDeptId(1);
        department.setDeptName("Testing Department");

        List<Department> mockList= List.of(department);

        when(departmentRepository.findAllWithEmployees()).thenReturn(mockList);

        List<Department> results=employeeService.getDepartmentList();

        assertEquals(1,results.size());
        assertEquals("Testing Department",results.get(0).getDeptName());

    }

    @Test
    public void testCreateEmployee(){

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName("Yash");
        employeeDTO.setEmail("yash@reddy.com");
        employeeDTO.setSalary(20000L);
        employeeDTO.setDepartmentId(1L);

        // Create a dummy Department to return
        Department mockDept = new Department();
        mockDept.setDeptId(1L);
        mockDept.setDeptName("IT");

        Employee savedEmployee= new Employee();
        savedEmployee.setEmpName("Yash");
        savedEmployee.setEmpMail("yash@reddy.com");
        savedEmployee.setEmpId(1L);
        savedEmployee.setEmpSalary(20000L);
        savedEmployee.setDepartment(mockDept);

        when(departmentRepository.findById(1L)).thenReturn(Optional.of(mockDept));
        when(employeeRepository.save(any(Employee.class))).thenReturn(savedEmployee);

        Employee result =employeeService.createEmployee(employeeDTO);

        assertEquals("Yash",result.getEmpName());
        assertEquals("yash@reddy.com",result.getEmpMail());

        verify(employeeRepository, times(1)).save(any(Employee.class));
    }

    @Test
    public void testCreateEmployee_noDepartment(){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName("Yash");
        employeeDTO.setEmail("yash@reddy.com");
        employeeDTO.setSalary(20000L);
        employeeDTO.setDepartmentId(99L);

        when(departmentRepository.findById(99L)).thenReturn(Optional.empty());
        // 3. ACT & ASSERT (Run & Verify Exception)
        // We expect the Service to throw a RuntimeException when we call it.
        RuntimeException exception = assertThrows(RuntimeException.class,()->{
            employeeService.createEmployee(employeeDTO);
        });

        assertEquals("Department not found with ID: 99",exception.getMessage());


        // 4. VERIFY SAFETY
        // Ensure that the save method was NEVER called.
        // (We should not save an employee if the department is missing)
        verify(employeeRepository,never()).save(any(Employee.class));
    }

    @Test
    public void testGetEmployeeWithID(){
        Employee employee = new Employee();
        employee.setEmpName("Yash");
        employee.setEmpId(1L);

        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
//        Optional<Employee> result = employeeService.getEmployeeWithID(1L);
        // If getEmployeeWithID is returning Employee object we need to change this return
        //type here as well.
        Employee result = employeeService.getEmployeeWithID(1L);

//        assertEquals(1L,result.get().getEmpId());
        assertEquals(1L,result.getEmpId()); //we can remove .get()
        assertEquals("Yash",result.getEmpName());
        verify(employeeRepository,never()).save(any(Employee.class));

    }

}
