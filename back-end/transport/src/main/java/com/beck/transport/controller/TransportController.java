package com.beck.transport.controller;

import com.beck.transport.dto.AddressRequestDto;
import com.beck.transport.service.AddressService;
import com.beck.transport.service.zipCode.ZipCodeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/address")
public class TransportController {

    @Autowired
    private AddressService addressService;


    @PostMapping
    public ResponseEntity createAddress(@RequestBody @Valid AddressRequestDto data, UriComponentsBuilder uriBuilder) {
        var address = addressService.createAddress(data);
        var uri = uriBuilder.path("/address/{id}").buildAndExpand(address.id()).toUri();
        return ResponseEntity.created(uri).body(address);
    }
    
    @GetMapping("/{zipCode}/{number}")
    public ResponseEntity getAddressByData(@PathVariable String zipCode, @PathVariable String number) {
        var address = addressService.getAddressByZipCodeAndNumber(zipCode, number);
        return ResponseEntity.ok(address);
    }

}
