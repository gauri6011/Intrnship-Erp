package com.example.villa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.villa.entity.User;
import com.example.villa.service.UserService;



@RestController
@CrossOrigin
@RequestMapping("/auth")
public class AuthenticationController {
    
	@Autowired
	private UserService userService; 
	
	@PostMapping("/signup")
	public String register(@RequestBody User user) {
		return userService.register(user);
	}
	
	@PostMapping("/signin")
	public String login(@RequestBody User user) {
		
		
		return userService.login(user);
		
	}
	
	@PutMapping("/resetPass")
	public String resetPass(@RequestBody User user) {
		
		return userService.resetPass(user);
	}
	
	
}
