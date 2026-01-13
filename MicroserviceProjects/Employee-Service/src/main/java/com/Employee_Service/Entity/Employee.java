package com.Employee_Service.Entity;

import com.Employee_Service.DTO.DepartmentDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter @Setter
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    @Column(nullable = false)
    private String empName;
    @Column(nullable = false,unique = true)
    private String empMail;
    private long empSalary;

    private Long departmentId;

/*    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id",nullable = false)
    @JsonIgnore
    private DepartmentDTO department;*/

}
