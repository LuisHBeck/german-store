package com.beck.transport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "shipping")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private LocalDate deliveryDeadline;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;


    public void setStatusAsPreparation() {
        this.status = DeliveryStatus.PREPARATION;
    }

    public void setStatusAsForwarded() {
        this.status = DeliveryStatus.FORWARDED;
    }

    public void setStatusAsOutForDelivery() {
        this.status = DeliveryStatus.OUT_FOR_DELIVERY;
    }

    public void setStatusAsDelivered() {
        this.status = DeliveryStatus.DELIVERED;
    }

}
