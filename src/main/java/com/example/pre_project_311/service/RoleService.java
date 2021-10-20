package com.example.pre_project_311.service;

import com.example.pre_project_311.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRoleByName(String roleName);
}
