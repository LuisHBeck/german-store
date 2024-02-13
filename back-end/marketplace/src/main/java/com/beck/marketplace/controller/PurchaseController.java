package com.beck.marketplace.controller;

import com.beck.marketplace.dto.PurchaseRequestDto;
import com.beck.marketplace.service.purchase.PurchaseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity createPurchaseOrder(@RequestHeader("Authorization") String tokenJWT, @RequestBody @Valid PurchaseRequestDto data, UriComponentsBuilder uriBuilder) {
        var purchase = purchaseService.createPurchase(data, tokenJWT);
        var uri = uriBuilder.path("/purchase/{id}").build(purchase.id());
        return ResponseEntity.created(uri).body(purchase);
    }
}
