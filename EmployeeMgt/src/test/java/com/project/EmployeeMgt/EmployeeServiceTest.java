package com.project.EmployeeMgt;

import com.project.EmployeeMgt.Entity.Department;
import com.project.EmployeeMgt.Repository.DepartmentRepository;
import com.project.EmployeeMgt.Repository.EmployeeRepository;
import com.project.EmployeeMgt.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


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

}
