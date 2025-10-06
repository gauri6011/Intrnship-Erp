package com.example.usermanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermanagement.entity.UserEntity;
import com.example.usermanagement.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<UserEntity> getAllUsers() {
        return repo.findAll();
    }

    public UserEntity getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public UserEntity saveUser(UserEntity user) {
        return repo.save(user);
    }

    public UserEntity updateUser(Long id, UserEntity userDetails) {
        UserEntity existingUser = repo.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(userDetails.getUsername());
            existingUser.setEmail(userDetails.getEmail());
            existingUser.setPassword(userDetails.getPassword());
            existingUser.setRole(userDetails.getRole());
            return repo.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
