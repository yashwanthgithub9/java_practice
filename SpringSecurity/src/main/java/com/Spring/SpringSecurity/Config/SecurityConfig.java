package com.Spring.SpringSecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //This will define the class as Configuration where default Security configs can be overridden
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
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
	
//	@Bean // this is will tell spring security to use below config
//	public UserDetailsService detailsService() { 
//		//UserDetailsService is interface, USerDetails class implements that
//		UserDetails details= User
//				.withDefaultPasswordEncoder()
//				.username("user1")
//				.password("pass1")
//				.build();
//		UserDetails details2= User
//				.withDefaultPasswordEncoder()
//				.username("user2")
//				.password("pass2")
//				.build();
//		
//		return new InMemoryUserDetailsManager(details,details2);
//	}
	
	  @Bean
	    public AuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
	        provider.setUserDetailsService(userDetailsService);


	        return provider;
	    }

}
