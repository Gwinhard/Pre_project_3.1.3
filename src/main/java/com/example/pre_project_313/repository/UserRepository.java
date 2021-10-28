package com.example.pre_project_313.repository;

import com.example.pre_project_313.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findUserByEmail(String email);
}