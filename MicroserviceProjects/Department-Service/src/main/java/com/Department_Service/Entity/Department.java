package com.Department_Service.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptId;
    @Column(nullable = false,unique = true)
    private String deptName;
    private String deptCode;

//    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
////  @JsonIgnore        // <--- THE FIX: "Don't print this list in the JSON"
//    List<Employee> employees;
}
