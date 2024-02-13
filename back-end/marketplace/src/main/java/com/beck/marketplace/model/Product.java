package com.beck.marketplace.model;

import com.beck.marketplace.dto.ProductRequestData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;

    private Double price;

    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String description;

    private Integer stockQuantity;

    @Basic(fetch = FetchType.LAZY)
    private String fileName;


    public Product(ProductRequestData data) {
        this.name = data.name();
        this.productCategory = data.productCategory();
        this.price = data.price();
        this.description = data.description();
        this.stockQuantity = data.stockQuantity();
        this.fileName = data.fileName();
    }

    public void updateStockQuantity(Integer purchaseAmount) {
        this.stockQuantity -= purchaseAmount;
    }
}
