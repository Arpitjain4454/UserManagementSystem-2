package com.example.UserManagement.usermanagement.repository;

import com.example.UserManagement.usermanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
