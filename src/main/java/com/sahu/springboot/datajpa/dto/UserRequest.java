package com.sahu.springboot.datajpa.dto;

import java.time.LocalDate;

public record UserRequest(
        String username,
        String firstName,
        String middleName,
        String lastName,
        String email,
        LocalDate dateOfBirth
)
{
}
