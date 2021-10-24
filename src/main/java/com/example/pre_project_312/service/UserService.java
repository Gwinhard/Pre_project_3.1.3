package com.example.pre_project_312.service;

import com.example.pre_project_312.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(long id, User user);

    void removeUser(long id);

    User getUserById(long id);

    User getUserByEmail(String email);

    List<User> getAllUsers();
}
