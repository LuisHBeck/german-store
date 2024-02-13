package com.beck.marketplace.model;

import com.beck.marketplace.dto.PurchaseRequestDto;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "purchase_order")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @OneToMany(mappedBy = "purchaseOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<PurchaseOrderItem> purchaseItems;

    private double purchaseValue;

    public PurchaseOrder(PurchaseRequestDto purchaseData) {
//        this.userId = purchaseData.userId();
        this.purchaseItems = new ArrayList<>();
        purchaseData.products().forEach(item -> {
            var orderItem = new PurchaseOrderItem(item);
            orderItem.setPurchaseOrder(this);
            this.purchaseItems.add(orderItem);
        });
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
