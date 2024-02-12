package com.beck.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;

public record PurchaseProductOrderDto(
        @NotNull
        Long id,
        @JsonAlias({"units"})
        int amount
) {
}
