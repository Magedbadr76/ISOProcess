package com.isoProcess.service;

import com.isoProcess.entity.Role;
import java.util.List;
import java.util.Optional;

public interface RoleService {

    Role saveRole(Role role); // Create or update Role

    Optional<Role> getRoleById(int id); // Get Role by id

    List<Role> getAllRoles(); // Get all Roles

    void deleteRoleById(int id); // Delete Role by id
}