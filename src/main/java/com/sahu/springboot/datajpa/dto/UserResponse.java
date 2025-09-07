package com.sahu.springboot.datajpa.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record UserResponse(
        Long id,
        String username,
        String firstName,
        String middleName,
        String lastName,
        String email,
        LocalDate dateOfBirth
)
{
}
