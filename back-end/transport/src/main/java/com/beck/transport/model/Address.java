package com.beck.transport.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Table(name = "address")
@EqualsAndHashCode(of = "id")
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String neighborhood;

    private String number;

    private String city;

    private String zipCode;
}
