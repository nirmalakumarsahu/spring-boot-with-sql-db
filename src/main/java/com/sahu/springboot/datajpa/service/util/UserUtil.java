package com.sahu.springboot.datajpa.service.util;

import com.sahu.springboot.datajpa.dto.UserRequest;
import com.sahu.springboot.datajpa.dto.UserResponse;
import com.sahu.springboot.datajpa.model.User;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class UserUtil {

    public static User toUser(UserRequest userRequest) {
        return User.builder()
                .username(userRequest.username())
                .firstName(userRequest.firstName())
                .middleName(userRequest.middleName())
                .lastName(userRequest.lastName())
                .email(userRequest.email())
                .dateOfBirth(userRequest.dateOfBirth())
                .build();
    }

    public UserResponse toUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .middleName(user.getMiddleName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .dateOfBirth(user.getDateOfBirth())
                .build();
    }


    public List<UserResponse> toUserResponseList(List<User> users) {
        return users.stream().map(UserUtil::toUserResponse).toList();
    }

}
