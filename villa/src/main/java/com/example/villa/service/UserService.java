package com.example.villa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.villa.Repository.UserRepo;
import com.example.villa.entity.User;
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public String register(User user) {
        if (user == null) return "Invalid Request";

        if (user.getPassword() == null || user.getConfirmPassword() == null) {
            return "Password fields cannot be null";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setConfirmPassword(passwordEncoder.encode(user.getConfirmPassword()));

        userRepo.save(user);
        return "User Registered Successfully!";
    }


    public String login(User user) {
        User dbUser = userRepo.findByUsername(user.getUsername());
        
        if (dbUser == null) {
            return "Invalid Username!";
        }
        if (!passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {
            return "Incorrect Password!";
        }
        return "Login Successful!";
    }

    public String resetPass(User user) {
        User dbUser = userRepo.findByEmail(user.getEmail());
        if (dbUser == null) return "User Not Found!";

        dbUser.setPassword(passwordEncoder.encode(user.getPassword()));
        dbUser.setConfirmPassword(passwordEncoder.encode(user.getConfirmPassword()));
        userRepo.save(dbUser);
        return "Password Updated Successfully!";
    }
}
