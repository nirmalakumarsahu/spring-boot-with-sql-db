package com.sahu.springboot.datajpa.controller.rest;

import com.sahu.springboot.datajpa.dto.ApiResponse;
import com.sahu.springboot.datajpa.dto.UserRequest;
import com.sahu.springboot.datajpa.dto.UserResponse;
import com.sahu.springboot.datajpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAllUsers() {
        return ApiResponse.success(HttpStatus.OK, "Users Found",
                userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponse>> createUser(UserRequest userRequest) {
        return ApiResponse.success(HttpStatus.CREATED, "User Created",
                userService.createUser(userRequest));
    }

}
