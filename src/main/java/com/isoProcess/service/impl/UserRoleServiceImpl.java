package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.UserRole;
import com.isoProcess.repo.UserRoleRepository;
import com.isoProcess.service.UserRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public UserRole saveOrUpdateUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole getUserRoleById(Integer id) {
        Optional<UserRole> userRole = userRoleRepository.findById(id);
        return userRole.orElse(null);
    }

    @Override
    public List<UserRole> getAllUserRoles() {
        return userRoleRepository.findAll();
    }

    @Override
    public void deleteUserRoleById(Integer id) {
        userRoleRepository.deleteById(id);
    }

    @Override
    public List<UserRole> getUserRolesByUserId(int userId) {
        return userRoleRepository.findByUserId(userId);
    }

    @Override
    public List<UserRole> getUserRolesByRoleId(int roleId) {
        return userRoleRepository.findByRoleId(roleId);
    }
}
