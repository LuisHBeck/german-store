package com.beck.transport.dto;

public record AddressInfoAPIData(
        String street,
        String neighborhood,
        String city,

        String zipCode

) {
    public AddressInfoAPIData(ZipCodeAPIResultDto resultDto) {
        this(resultDto.street(), resultDto.neighborhood(), resultDto.locality(), resultDto.zipCode());
    }
}
