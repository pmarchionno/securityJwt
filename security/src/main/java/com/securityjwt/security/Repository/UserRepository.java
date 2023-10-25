package com.securityjwt.security.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securityjwt.security.model.User;

public interface UserRepository extends JpaRepository<User,Integer>  {
    Optional<User> findByUsername(String username);  
}
