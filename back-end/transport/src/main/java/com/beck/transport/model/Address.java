package com.beck.transport.model;

import com.beck.transport.dto.api.viacep.AddressInfoAPIData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
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
