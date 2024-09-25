package com.isoProcess.repo;


import java.util.List;

import com.isoProcess.entity.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

	  // Find user roles by user ID
    List<UserRole> findByUserId(int userId);
    
    // Find user roles by role ID
    List<UserRole> findByRoleId(int roleId);
}
