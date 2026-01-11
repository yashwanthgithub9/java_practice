package com.Employee_Service.Consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "employee-group")
    public void consumeKafka(String msg){
        System.out.println(msg);
    }
}
