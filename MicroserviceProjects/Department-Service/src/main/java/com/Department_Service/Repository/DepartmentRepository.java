package com.Department_Service.Repository;

import com.Department_Service.Entity.Department ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    // STANDARD METHOD:
    // This triggers the N+1 Problem (1 query for Dept + N queries for Employees).
    // We keep this to show the "Bad" way in interviews.
    List<Department> findAll();

    // INTERVIEW GOLD (THE FIX):
    // "LEFT JOIN FETCH" forces Hibernate to load Employees in the SAME query.
    // Result: 1 Query total. Performance saved.

    // THE EXPLANATION:
    // SELECT d      -> "Give me the Department object"
    // FROM Department d
    // LEFT JOIN     -> "Match it with..."
    // FETCH         -> "STAPLE the data right now (Load it into memory)"
    // d.employees   -> "...the list of employees belonging to that department"
/*    @Query("select d from Department d LEFT JOIN FETCH d.employees")
    List<Department> findAllWithEmployees();*/
}
