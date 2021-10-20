package com.example.pre_project_311.service;

import com.example.pre_project_311.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);

    void updateUser(long id, User user);

    void removeUser(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
