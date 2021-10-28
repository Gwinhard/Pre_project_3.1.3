package com.example.pre_project_313.service;

import com.example.pre_project_313.dto.UserDto;
import com.example.pre_project_313.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(long id, User user);

    void removeUser(long id);

    User getUserById(long id);

    User getUserByEmail(String email);

    List<User> getAllUsers();

    public User convertUserDtoToUser(UserDto userDto);
}
