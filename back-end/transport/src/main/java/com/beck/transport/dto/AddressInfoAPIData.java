package com.beck.transport.dto;

public record AddressInfoAPIData(
        String street,
        String neighborhood,
        String city
) {
    public AddressInfoAPIData(ZipCodeAPIResultDto resultDto) {
        this(resultDto.logadouro(), resultDto.bairro(), resultDto.localidade());
    }
}
