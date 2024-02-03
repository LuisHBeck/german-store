package com.store.user.dto;

import com.store.user.model.User;

public record UserDetailingData(
        Long id,
        String username
) {
    public UserDetailingData(User user) {
        this(user.getId(), user.getUsername());
    }
}
