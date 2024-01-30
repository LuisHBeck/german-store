package com.beck.marketplace.dto;

import com.beck.marketplace.model.ProductCategory;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestData(

        @NotNull
        @NotBlank
        String name,

        @JsonAlias({"category"})
        ProductCategory productCategory,

        @NotNull
        Double price,

        @NotNull
        @NotBlank
        String description,

        @JsonAlias({"image", "imageName"})
        String fileName

) {
}
