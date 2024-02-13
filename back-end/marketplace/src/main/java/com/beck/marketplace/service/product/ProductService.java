package com.beck.marketplace.service.product;

import com.beck.marketplace.dto.ProductDetailingData;
import com.beck.marketplace.dto.ProductRequestData;
import com.beck.marketplace.model.Product;
import com.beck.marketplace.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<ProductDetailingData> listProductsInStock(Pageable pageable) {
//        var products = productRepository.findAll(pageable);
        var products = productRepository.findByStockQuantityGreaterThan(0, pageable);
        return products.map(ProductDetailingData::new);
    }

    public ProductDetailingData listProductById(Long id) {
        var product = productRepository.getReferenceById(id);
        return new ProductDetailingData(product);
    }
}
