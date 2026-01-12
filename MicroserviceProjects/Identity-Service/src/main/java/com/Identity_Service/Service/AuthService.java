package com.Identity_Service.Service;

import com.Identity_Service.Config.CustomUserEvents;
import com.Identity_Service.Entity.UserCredential;
import com.Identity_Service.Repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserCredentialRepository userCredentialRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private KafkaPublisher kafkaPublisher;

    //Save User

    public String saveUser(UserCredential credential){

        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        userCredentialRepository.save(credential);

        CustomUserEvents customUserEvents = new CustomUserEvents();
        customUserEvents.setUsername(credential.getName());
        customUserEvents.setEmail(credential.getEmail());
        kafkaPublisher.sendMessage(customUserEvents);

        return "User Saved";



    }

    // Generate Token for existing user

    public String generateToken(String name){

        return jwtService.generateToken(name);
    }

    // Add this to AuthService.java
    public void validateToken(String token) {
        jwtService.validateJwt(token);
    }
}
