package com.beck.marketplace.dto;

import com.beck.marketplace.model.PurchaseOrder;
import com.beck.marketplace.model.PurchaseOrderItem;

import java.util.List;

public record PurchaseDetailingDto(
        Long id,
        Long userId,
        List<PurchaseOrderItem> products
) {
    public PurchaseDetailingDto(PurchaseOrder purchaseOrder) {
        this(purchaseOrder.getId(), purchaseOrder.getUserId(), List.copyOf(purchaseOrder.getPurchaseItems()));
    }
}
