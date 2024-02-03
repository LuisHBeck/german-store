package com.store.user.dto;

public record UserRegistrationData(
        String username,
        String password,
        String confirmPassword
) {
}
