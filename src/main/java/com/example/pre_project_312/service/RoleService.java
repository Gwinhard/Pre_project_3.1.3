package com.example.pre_project_312.service;

import com.example.pre_project_312.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRoleByName(String roleName);
}
