package com.beck.transport.dto;

import com.beck.transport.model.Address;

public record AddressDetailingData(
        Long id,
        String street,
        String neighborhood,
        String number,
        String city,
        String zipCode

) {
    public AddressDetailingData(Address address) {
        this(address.getId(), address.getStreet(), address.getNeighborhood(), address.getNumber(), address.getCity(), address.getZipCode());
    }
}
