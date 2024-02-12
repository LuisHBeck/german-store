package com.beck.marketplace.service;

import com.beck.marketplace.dto.PurchaseDetailingDto;
import com.beck.marketplace.dto.PurchaseRequestDto;
import com.beck.marketplace.model.PurchaseOrder;
import com.beck.marketplace.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseDetailingDto createPurchase(PurchaseRequestDto purchaseDto) {
        var purchaseOrder = new PurchaseOrder(purchaseDto);
        purchaseOrderRepository.save(purchaseOrder);
        return new PurchaseDetailingDto(purchaseOrder);
    }
}
