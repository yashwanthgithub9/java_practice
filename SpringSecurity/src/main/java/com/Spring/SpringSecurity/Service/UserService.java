package com.Spring.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringSecurity.Model.Users;
import com.Spring.SpringSecurity.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;

	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		
		return repo.save(user); //Now one user is added into DB
	}
	
//	1	yash	yash@123
//	2	reddy	reddy@123
//	3	yashwanth	yashwanth

}
