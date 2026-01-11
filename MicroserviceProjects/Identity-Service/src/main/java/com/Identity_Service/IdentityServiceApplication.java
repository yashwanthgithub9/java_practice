package com.Identity_Service;

import com.Identity_Service.Service.KafkaPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class IdentityServiceApplication {

	public static void main(String[] args)
    {
		SpringApplication.run(IdentityServiceApplication.class, args);
	}
/*    // THIS IS THE NEW PART
    @Bean
    CommandLineRunner commandLineRunner(KafkaPublisher kafkaPublisher) {
        return args -> {
            kafkaPublisher.sendMessage("🚀 HELLO FROM STARTUP - NO SECURITY CAN STOP ME!");
        };
    }*/
}
