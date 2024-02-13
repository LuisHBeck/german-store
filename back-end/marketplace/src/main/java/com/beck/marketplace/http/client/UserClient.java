package com.beck.marketplace.http.client;

import com.beck.marketplace.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    UserDto getUserDetails(@RequestHeader("Authorization") String tokenJWT);

}
