package com.example.villa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")

public class User {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Let DB auto-generate ID
    private Long id;
	private String email;
	
	private String password;
	private String username;
	private String ConfirmPassword;
	private String role;
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", ConfirmPassword="
				+ ConfirmPassword + ", role=" + role + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
