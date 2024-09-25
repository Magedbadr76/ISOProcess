package com.isoProcess.controller;

import com.isoProcess.entity.User;
import com.isoProcess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createOrUpdateUser(@RequestBody User user) {
        return userService.saveOrUpdateUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return "User deleted successfully!";
    }

    @PutMapping("/{id}/email")
    public User updateUserEmail(@PathVariable Integer id, @RequestParam String email) {
        return userService.updateUserEmail(id, email);
    }

    @PutMapping("/{id}/phone")
    public User updateUserPhone(@PathVariable Integer id, @RequestParam String phone) {
        return userService.updateUserPhone(id, phone);
    }
}