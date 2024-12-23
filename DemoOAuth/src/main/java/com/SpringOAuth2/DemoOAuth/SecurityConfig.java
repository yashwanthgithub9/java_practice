package com.SpringOAuth2.DemoOAuth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	public SecurityFilterChain chain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity
				.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
				.oauth2Login(Customizer.withDefaults());
		
		
		
		return httpSecurity.build();
		
	}

}
