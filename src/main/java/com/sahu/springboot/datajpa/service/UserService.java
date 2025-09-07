package com.sahu.springboot.datajpa.service;

import com.sahu.springboot.datajpa.dto.UserRequest;
import com.sahu.springboot.datajpa.dto.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAllUsers();

    UserResponse createUser(UserRequest userRequest);
}
