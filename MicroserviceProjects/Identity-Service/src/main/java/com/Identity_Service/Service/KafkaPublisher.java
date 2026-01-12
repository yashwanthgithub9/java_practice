package com.Identity_Service.Service;


import com.Identity_Service.Config.CustomUserEvents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisher {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
/*
    public void sendMessage(String message){
        kafkaTemplate.send("test-topic",message);
        System.out.println("Message sent from Kafka is : "+message);
    }*/

    public void sendMessage(CustomUserEvents customUserEvents){

        Message<CustomUserEvents> customUserEventsMessage = MessageBuilder
                .withPayload(customUserEvents)
                .setHeader(KafkaHeaders.TOPIC,"user-events")
                .build();
        kafkaTemplate.send(customUserEventsMessage);
    }
}
