package com.beck.marketplace.controller;

import com.beck.marketplace.dto.PurchaseRequestDto;
import com.beck.marketplace.service.PurchaseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity createPurchaseOrder(@RequestBody @Valid PurchaseRequestDto data, UriComponentsBuilder uriBuilder) {
        var purchase = purchaseService.createPurchase(data);
        var uri = uriBuilder.path("/purchase/{id}").build(purchase.id());
        return ResponseEntity.created(uri).body(purchase);
    }
}
