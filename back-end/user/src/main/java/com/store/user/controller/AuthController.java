package com.store.user.controller;

import com.store.user.dto.AuthData;
import com.store.user.dto.JWTDto;
import com.store.user.infra.security.TokenService;
import com.store.user.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity generateJWTToken(@RequestBody @Valid AuthData data) {
        var userToken = new UsernamePasswordAuthenticationToken(data.username(), data.password());
        var authentication = authManager.authenticate(userToken);
        var jwtToken = tokenService.generateToken((User) authentication.getPrincipal());
        return ResponseEntity.ok(new JWTDto(jwtToken));
    }
}
