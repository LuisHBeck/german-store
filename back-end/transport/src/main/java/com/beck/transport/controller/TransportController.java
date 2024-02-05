package com.beck.transport.controller;

import com.beck.transport.dto.AddressRequestDto;
import com.beck.transport.service.AddressService;
import com.beck.transport.service.zipCode.ZipCodeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class TransportController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private ZipCodeService zipCodeService;

//    @GetMapping("/{zipCode}")
//    public void createAddress(@RequestBody @Valid AddressRequestDto data, @PathVariable String zipCode) {
//        var info = zipCodeService.getAddressByZipCode(zipCode);
//        System.out.println(info);
//    }

    @GetMapping("/{zipCode}")
    public void createAddress(@PathVariable String zipCode) {
        var info = zipCodeService.getAddressByZipCode(zipCode);
        System.out.println(info);
    }

}
