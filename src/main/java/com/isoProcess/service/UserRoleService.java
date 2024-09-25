package com.isoProcess.service;

import com.isoProcess.entity.UserRole;

import java.util.List;

public interface UserRoleService {

    // Create or update a UserRole
    UserRole saveOrUpdateUserRole(UserRole userRole);

    // Retrieve a UserRole by ID
    UserRole getUserRoleById(Integer id);

    // Retrieve all UserRoles
    List<UserRole> getAllUserRoles();

    // Delete a UserRole by ID
    void deleteUserRoleById(Integer id);

    // Retrieve UserRoles by user ID
    List<UserRole> getUserRolesByUserId(int userId);

    // Retrieve UserRoles by role ID
    List<UserRole> getUserRolesByRoleId(int roleId);
}