package com.Employee_Service.Consumer;


import com.Employee_Service.DTO.CustomUserEvents;
import com.Employee_Service.Entity.Employee;
import com.Employee_Service.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    private EmployeeRepository employeeRepository;
/*    @KafkaListener(topics = "test-topic", groupId = "employee-group")
    public void consumeKafka(String msg){
        System.out.println(msg);
    }*/

    @KafkaListener(topics = "user-events", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeKafka(CustomUserEvents customUserEvents){

        Employee employee= new Employee();
        employee.setEmpName(customUserEvents.getUsername());
        employee.setEmpMail(customUserEvents.getEmail());
        employeeRepository.save(employee);

        System.out.println("✅ SUCCESS: Saved new employee to Database: " + employee.getEmpName());
/*
        System.out.println("Message received from kafka");
        System.out.println("username : "+customUserEvents.getUsername());
        System.out.println("email : "+customUserEvents.getEmail());*/
    }
}
