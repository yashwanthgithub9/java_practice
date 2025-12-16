package com.project.EmployeeMgt.Repository;

import com.project.EmployeeMgt.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
