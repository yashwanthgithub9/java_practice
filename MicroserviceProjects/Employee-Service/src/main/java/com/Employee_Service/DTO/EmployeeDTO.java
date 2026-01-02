package com.Employee_Service.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class EmployeeDTO {

    @NotBlank(message = "Should Not be empty")
    private String name;
    @Email(message = "Invalid email format")
    @NotBlank(message = "Should Not be empty")
    private String email;
    @Min(value = 1000,message = "Salary should not be less than 1000")
    private Long salary;
    private Long departmentId;

    private DepartmentDTO departmentDTO;

}

