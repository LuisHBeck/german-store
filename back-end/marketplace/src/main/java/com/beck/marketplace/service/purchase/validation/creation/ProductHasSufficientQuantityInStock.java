package com.beck.marketplace.service.purchase.validation.creation;

import com.beck.marketplace.dto.PurchaseProductOrderDto;
import com.beck.marketplace.infra.validation.ValidException;
import com.beck.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductHasSufficientQuantityInStock implements PurchaseCreationValidators{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void validate(PurchaseProductOrderDto product) {
        var hasSufficientQuantityInStock = productRepository.existsByIdAndStockQuantityGreaterThan(product.id(), product.amount());
        System.out.println(hasSufficientQuantityInStock);
        if(!hasSufficientQuantityInStock) throw new ValidException(String.format("Product with id %s doesn't have sufficient quantity in stock", product.id()));
    }
}
