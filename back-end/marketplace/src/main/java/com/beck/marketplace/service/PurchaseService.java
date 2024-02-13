package com.beck.marketplace.service;

import com.beck.marketplace.dto.PurchaseDetailingDto;
import com.beck.marketplace.dto.PurchaseProductOrderDto;
import com.beck.marketplace.dto.PurchaseRequestDto;
import com.beck.marketplace.model.PurchaseOrder;
import com.beck.marketplace.repository.ProductRepository;
import com.beck.marketplace.repository.PurchaseOrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public PurchaseDetailingDto createPurchase(PurchaseRequestDto purchaseDto) {
        var purchaseOrder = new PurchaseOrder(purchaseDto);
        purchaseOrder.setPurchaseValue(calculatePurchaseValue(purchaseDto.products()));
        purchaseOrderRepository.save(purchaseOrder);

        updateProductStock(purchaseDto.products());

        return new PurchaseDetailingDto(purchaseOrder);
    }

    @Transactional
    private void updateProductStock(List<PurchaseProductOrderDto> products) {
        for(PurchaseProductOrderDto item : products) {
            var product = productRepository.getReferenceById(item.id());
            product.updateStockQuantity(item.amount());
        }
    }

    private double calculatePurchaseValue(List<PurchaseProductOrderDto> products) {
        double purchaseValue = 0.0;
        for(PurchaseProductOrderDto item : products) {
            var product = productRepository.getReferenceById(item.id());
            purchaseValue += (product.getPrice()*item.amount());
        }
        return purchaseValue;
    }
}
