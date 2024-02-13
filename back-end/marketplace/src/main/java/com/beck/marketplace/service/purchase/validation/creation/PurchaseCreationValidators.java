package com.beck.marketplace.service.purchase.validation.creation;

import com.beck.marketplace.dto.PurchaseProductOrderDto;

public interface PurchaseCreationValidators {
    void validate(PurchaseProductOrderDto product);
}
