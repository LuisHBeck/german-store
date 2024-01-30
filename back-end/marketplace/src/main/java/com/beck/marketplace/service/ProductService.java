package com.beck.marketplace.service;

import com.beck.marketplace.dto.ProductDetailingData;
import com.beck.marketplace.dto.ProductRequestData;
import com.beck.marketplace.model.Product;
import com.beck.marketplace.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public ProductDetailingData createProduct(ProductRequestData productData) {
        var product = productRepository.save(new Product(productData));
        return new ProductDetailingData(product);
    }
}
