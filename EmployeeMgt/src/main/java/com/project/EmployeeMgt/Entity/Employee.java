package com.project.EmployeeMgt.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    @Column(nullable = false)
    private String empName;
    @Column(nullable = false,unique = true)
    private String empMail;
    private long empSalary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id",nullable = false)
    private Department department;

}
