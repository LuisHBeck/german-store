package com.beck.marketplace.model;

import com.beck.marketplace.dto.PurchaseProductOrderDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "purchase_order_item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PurchaseOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JsonBackReference
    private PurchaseOrder purchaseOrder;

    private Long productId;

    private int amount;

    public PurchaseOrderItem(PurchaseProductOrderDto productOrder) {
        this.productId = productOrder.id();
        this.amount = productOrder.amount();
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

}
