package com.Employee_Service.Client;


import com.Employee_Service.DTO.DepartmentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Department-Service")
public interface APIClient {

    @GetMapping("/departments/{id}")
    DepartmentDTO getDepartmentByID(@PathVariable("id") Long id);

}
