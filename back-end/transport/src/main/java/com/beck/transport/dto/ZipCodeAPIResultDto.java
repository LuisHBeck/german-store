package com.beck.transport.dto;

public record ZipCodeAPIResultDto(
        String cep,
        String logadouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        String ibge,
        String gia,
        String ddd,
        String siafi
) {
}
