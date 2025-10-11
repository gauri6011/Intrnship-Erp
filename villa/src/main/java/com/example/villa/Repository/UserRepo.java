package com.example.villa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.villa.entity.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	User findByUsername(String username);


	User findByEmail(String email);
	
}
