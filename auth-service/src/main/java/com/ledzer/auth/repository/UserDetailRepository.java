package com.ledzer.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ledzer.auth.model.User;

public interface UserDetailRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);
    
    Optional<User> findByEmail(String email);

}
