package com.beck.transport.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record AddressRequestDto(

        @NotBlank
        @NotNull
        @JsonAlias({"zip"})
        @Pattern(regexp = "^\\d{5}-?\\d{3}$")
        String zipCode,

        @NotBlank
        @NotNull
        String number) {
}
