package com.isoProcess.service;

import com.isoProcess.entity.User;

import java.util.List;

public interface UserService {
    
    // Create or update a User
    User saveOrUpdateUser(User user);
    
    // Retrieve a User by ID
    User getUserById(Integer id);
    
    // Retrieve all Users
    List<User> getAllUsers();
    
    // Delete a User by ID
    void deleteUserById(Integer id);
    
    // Update User's email
    User updateUserEmail(Integer id, String email);

    // Update User's phone number
    User updateUserPhone(Integer id, String phone);
}