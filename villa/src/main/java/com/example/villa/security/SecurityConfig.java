package com.example.villa.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity 
public class SecurityConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())  // Disable CSRF for testing with Postman/Browser

        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/auth/signin/**", "/auth/signup/**","/auth/resetPass/**").permitAll()  // Allow these
            .anyRequest().authenticated() // Other requests need login
        )

        .httpBasic(Customizer.withDefaults()); // Basic authentication

    return http.build();
	}
	
	 @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	
	
}