package com.example.UserManagement.usermanagement.service;
import java.util.List;
import java.util.Optional;

import com.example.UserManagement.usermanagement.model.User;
import com.example.UserManagement.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getUserld());
        if(optionalUser.isPresent()) {
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}
