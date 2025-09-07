package com.sahu.springboot.datajpa.repository;

import com.sahu.springboot.datajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
}
