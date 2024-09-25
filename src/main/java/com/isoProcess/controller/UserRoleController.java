package com.isoProcess.controller;

import com.isoProcess.entity.UserRole;
import com.isoProcess.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user-roles")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping
    public ResponseEntity<UserRole> saveOrUpdateUserRole(@RequestBody UserRole userRole) {
        UserRole savedUserRole = userRoleService.saveOrUpdateUserRole(userRole);
        return ResponseEntity.ok(savedUserRole);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRole> getUserRoleById(@PathVariable("id") Integer id) {
        UserRole userRole = userRoleService.getUserRoleById(id);
        if (userRole != null) {
            return ResponseEntity.ok(userRole);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<UserRole>> getAllUserRoles() {
        List<UserRole> userRoles = userRoleService.getAllUserRoles();
        return ResponseEntity.ok(userRoles);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserRoleById(@PathVariable("id") Integer id) {
        userRoleService.deleteUserRoleById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<UserRole>> getUserRolesByUserId(@PathVariable("userId") int userId) {
        List<UserRole> userRoles = userRoleService.getUserRolesByUserId(userId);
        return ResponseEntity.ok(userRoles);
    }

    @GetMapping("/role/{roleId}")
    public ResponseEntity<List<UserRole>> getUserRolesByRoleId(@PathVariable("roleId") int roleId) {
        List<UserRole> userRoles = userRoleService.getUserRolesByRoleId(roleId);
        return ResponseEntity.ok(userRoles);
    }
}