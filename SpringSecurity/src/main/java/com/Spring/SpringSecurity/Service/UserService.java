package com.Spring.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Spring.SpringSecurity.Model.Users;
import com.Spring.SpringSecurity.Repo.UserRepo;

@Service
public class UserService {
	
    @Autowired
    private JWTService jwtService;

    @Autowired
    private AuthenticationManager authManager;
	
	@Autowired
	private UserRepo repo;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);
	

	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		repo.save(user); //Now one user is added into DB
		return user;
	}


	public String verify(Users user) {
		// TODO Auto-generated method stub
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		   if (authentication.isAuthenticated()) {
		         return jwtService.generateToken(user.getUsername())  ;
		        } else {
		        	System.out.println("Not able to generate token");
		            return "fail";
		   }
	}
	}
	
//	1	yash	yash@123
//	2	reddy	reddy@123
//	3	yashwanth	yashwanth
	
//	1	yash	yash@123
//	2	reddy	reddy@123
//	3	purra	purra@123
//	4	bumrah	$2a$12$8yh6DQMGa4W2b.sTL96gnuoiniul7NxGHW/0G50nBbvS/l..lM7QK

	// updated a bcrypted password for user3

