package com.beck.transport.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ZipCodeAPIResultDto(
        @JsonAlias("cep")
        String zipCode,

        @JsonAlias("logradouro")
        String street,

        @JsonAlias("complemento")
        String complement,

        @JsonAlias("bairro")
        String neighborhood,

        @JsonAlias("localidade")
        String locality,
        String uf,
        String ibge,
        String gia,
        String ddd,
        String siafi
) {
}
