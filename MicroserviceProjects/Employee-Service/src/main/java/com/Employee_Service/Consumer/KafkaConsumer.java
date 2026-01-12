package com.Employee_Service.Consumer;


import com.Employee_Service.DTO.CustomUserEvents;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

/*    @KafkaListener(topics = "test-topic", groupId = "employee-group")
    public void consumeKafka(String msg){
        System.out.println(msg);
    }*/

    @KafkaListener(topics = "user-events", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeKafka(CustomUserEvents customUserEvents){

        System.out.println("Message received from kafka");
        System.out.println("username : "+customUserEvents.getUsername());
        System.out.println("email : "+customUserEvents.getEmail());
    }
}
