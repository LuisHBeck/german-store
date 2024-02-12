package com.beck.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PurchaseRequestDto(
        @JsonAlias({"user"})
        @NotNull
        Long userId,

        @NotNull
        List<PurchaseProductOrderDto> products
) {
}
