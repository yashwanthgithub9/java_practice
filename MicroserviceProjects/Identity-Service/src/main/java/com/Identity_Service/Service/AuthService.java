package com.Identity_Service.Service;

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


    //Save User

    private String saveUser(UserCredential credential){

        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        userCredentialRepository.save(credential);
        return "User Saved";

    }

    // Generate Token for existing user

    public String generateToken(String name){

        return jwtService.generateToken(name);
    }
}
