package com.example.pre_project_313.service;

import com.example.pre_project_313.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRoleByName(String roleName);
}
