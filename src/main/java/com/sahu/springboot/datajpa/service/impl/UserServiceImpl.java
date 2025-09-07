package com.sahu.springboot.datajpa.service.impl;

import com.sahu.springboot.datajpa.dto.UserRequest;
import com.sahu.springboot.datajpa.dto.UserResponse;
import com.sahu.springboot.datajpa.model.User;
import com.sahu.springboot.datajpa.repository.UserRepository;
import com.sahu.springboot.datajpa.service.UserService;
import com.sahu.springboot.datajpa.service.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserResponse> getAllUsers() {
        return UserUtil.toUserResponseList(userRepository.findAll());
    }

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = UserUtil.toUser(userRequest);
        user = userRepository.save(user);
        return UserUtil.toUserResponse(user);
    }

}
