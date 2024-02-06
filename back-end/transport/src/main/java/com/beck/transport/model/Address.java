package com.beck.transport.model;

import com.beck.transport.dto.AddressInfoAPIData;
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

    public Address(AddressInfoAPIData zipCodeAPIInfo, String number) {
        this.street = zipCodeAPIInfo.street();
        this.neighborhood = zipCodeAPIInfo.neighborhood();
        this.number = number;
        this.city = zipCodeAPIInfo.city();
        this.zipCode = zipCodeAPIInfo.zipCode();
    }
}
