package com.beck.marketplace.repository;

import com.beck.marketplace.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByStockQuantityGreaterThan(int stockQuantity, Pageable pageable);

    boolean existsByIdAndStockQuantityGreaterThan(Long id, int stockQuantity);
}
