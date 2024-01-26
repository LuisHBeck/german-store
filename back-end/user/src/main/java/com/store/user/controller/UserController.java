package com.store.user.controller;

import com.store.user.dto.UserRegistrationData;
import com.store.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity createUser(@RequestBody @Valid UserRegistrationData data, UriComponentsBuilder uriBuilder) {
        var user = userService.createUser(data);
        var uri = uriBuilder.path("/users/{id}").buildAndExpand(user.id()).toUri();
        return ResponseEntity.created(uri).body(user);
    }

    @GetMapping
    public ResponseEntity list(@PageableDefault(size = 10, sort = {"id"}) Pageable pageable) {
        var page = userService.listAllUsers(pageable);
        return ResponseEntity.ok(page);
    }
}
