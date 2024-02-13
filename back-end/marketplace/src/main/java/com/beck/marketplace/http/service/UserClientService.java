package com.beck.marketplace.http.service;

import com.beck.marketplace.http.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserClientService {

    @Autowired
    private UserClient userClient;

    public Long getUserId(String tokenJWT) {
        var userId = userClient.getUserDetails(tokenJWT);
        return userId.id();
    }

}
