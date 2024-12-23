package com.Spring.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Spring.SpringSecurity.Model.UserPrincipal;
import com.Spring.SpringSecurity.Model.Users;
import com.Spring.SpringSecurity.Repo.UserRepo;

@Service
public class MyUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Users user= repo.findByUsername(username);
		if(user==null) {
			System.out.println("User Not Found");
			throw new UsernameNotFoundException("Usernotfound");
		}
		
		return new UserPrincipal(user);
	}

}
