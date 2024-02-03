package com.beck.marketplace.controller;

import com.beck.marketplace.dto.ProductRequestData;
import com.beck.marketplace.service.ProductService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    @Transactional
    public ResponseEntity createProduct(@RequestBody @Valid ProductRequestData productData, UriComponentsBuilder uriBuilder) {
        var product = productService.createProduct(productData);
        var uri = uriBuilder.path("marketplace-service/products/{id}").build(product.id());
        return ResponseEntity.created(uri).body(product);
    }

    @GetMapping
    public ResponseEntity listProducts(@PageableDefault(sort = {"id"}) Pageable pageable) {
        var page = productService.listProducts(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity listProductById(@PathVariable Long id) {
        var product =  productService.listProductById(id);
        return ResponseEntity.ok(product);
    }
}
