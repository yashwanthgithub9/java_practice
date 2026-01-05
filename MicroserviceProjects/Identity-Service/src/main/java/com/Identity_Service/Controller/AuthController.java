package com.Identity_Service.Controller;


import com.Identity_Service.Entity.UserCredential;
import com.Identity_Service.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public String addUser(UserCredential credential){
        System.out.println("User received: " + credential.toString());
        return authService.saveUser(credential);

    }

    @PostMapping("/token")
    public String getToken(@RequestBody UserCredential userCredential){
        Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userCredential.getName(),userCredential.getPassword()));

        if (authentication.isAuthenticated()){
            return authService.generateToken(userCredential.getName());
        }
        else
            throw new RuntimeException("No Access");
    }

    @GetMapping("/validate")
    public String validateToken(@RequestParam("token") String token){

        authService.validateToken(token);
        return "Toke Validated";
    }


}
