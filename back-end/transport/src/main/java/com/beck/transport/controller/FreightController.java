package com.beck.transport.controller;

import com.beck.transport.service.zipCode.ZipCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/freight")
public class FreightController {

    @Autowired
    private ZipCodeService zipCodeService;

    @GetMapping("/{zipCode}")
    public ResponseEntity calculateFreight(@PathVariable String zipCode) throws URISyntaxException, IOException, InterruptedException {
        var freightDto = zipCodeService.getFreightByZipCode(zipCode);
        return ResponseEntity.ok(freightDto);
    }
}
