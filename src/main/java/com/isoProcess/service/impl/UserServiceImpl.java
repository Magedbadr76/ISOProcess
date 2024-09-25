package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.User;
import com.isoProcess.repo.UserRepository;
import com.isoProcess.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUserEmail(Integer id, String email) {
        User user = getUserById(id);
        if (user != null) {
            user.setuSER_EMAIL(email);
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUserPhone(Integer id, String phone) {
        User user = getUserById(id);
        if (user != null) {
            user.setuSER_TEL(phone);
            return userRepository.save(user);
        }
        return null;
    }
}