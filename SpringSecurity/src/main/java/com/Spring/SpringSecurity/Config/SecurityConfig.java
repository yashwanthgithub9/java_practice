package com.Spring.SpringSecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //This will define the class as Configuration where default Security configs can be overridden
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain chain(HttpSecurity httpSecurity) throws Exception {
//		
//		httpSecurity.csrf(customizer->customizer.disable() ); //disabling csrf
//		httpSecurity.authorizeHttpRequests(req->req.anyRequest().authenticated()); //Access to local host was denied
//		//You don't have the user rights to view this page. even creds won't work
//		
////		httpSecurity.formLogin(Customizer.withDefaults()); //enables login, in POSTMAN we'll get form instead of text
//		httpSecurity.httpBasic(Customizer.withDefaults()); // works for API calls
//		httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));// creates a new session every time we login
//		// if we want to work on login page after making session STATELESS we have to comment formlogin
//		
//		
//		return httpSecurity.build();
		
		
		//or with build pattern form
		
		return httpSecurity
			.csrf(customizer->customizer.disable())
			.authorizeHttpRequests(req->req.anyRequest().authenticated())
			.formLogin(Customizer.withDefaults())
			.httpBasic(Customizer.withDefaults())
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.build();
	}

}
