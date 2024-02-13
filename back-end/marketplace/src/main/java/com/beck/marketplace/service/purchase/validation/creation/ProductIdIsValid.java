package com.beck.marketplace.service.purchase.validation.creation;

import com.beck.marketplace.dto.PurchaseProductOrderDto;
import com.beck.marketplace.infra.validation.ValidException;
import com.beck.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductIdIsValid implements PurchaseCreationValidators{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void validate(PurchaseProductOrderDto product) {
        var isAValidProduct = productRepository.existsById(product.id());
        if(!isAValidProduct) throw new ValidException(String.format("Product with id: %s its invalid", product.id()));
    }
}
