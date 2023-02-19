package com.example.UserManagement.usermanagement.service;

import com.example.UserManagement.usermanagement.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);

    User getUserById(long userId);

    void deleteUser(long userId);

    User updateUser(User user);

    List<User> getAllUsers();
}
