package com.store.user.service;

import com.store.user.dto.UserDetailingData;
import com.store.user.dto.UserRegistrationData;
import com.store.user.model.User;
import com.store.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public UserDetailingData createUser(UserRegistrationData data) {
        var encryptedPassword = encryptPassword(data.password());
        var user = new User(data.username(), encryptedPassword);

        userRepository.save(user);
        return new UserDetailingData(user);
    }

    public Page<UserDetailingData> listAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).map(UserDetailingData::new);
    }

    private String encryptPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
