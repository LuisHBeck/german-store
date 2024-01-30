package com.beck.marketplace.dto;

import com.beck.marketplace.model.Product;
import com.beck.marketplace.model.ProductCategory;

public record ProductDetailingData(
        Long id,
        String name,
        ProductCategory productCategory,
        Double price,
        String description,
        String fileName
) {
    public ProductDetailingData(Product product) {
        this(
                product.getId(),
                product.getName(),
                product.getProductCategory(),
                product.getPrice(),
                product.getDescription(),
                product.getFileName()
        );
    }
}
