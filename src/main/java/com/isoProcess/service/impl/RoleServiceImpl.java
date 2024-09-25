package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;

import com.isoProcess.entity.Role;
import com.isoProcess.repo.RoleRepository;
import com.isoProcess.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
    private RoleRepository roleRepository;


    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Optional<Role> getRoleById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRoleById(int id) {
        roleRepository.deleteById(id);
    }
}