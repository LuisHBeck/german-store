package com.beck.transport.dto.api.freight;

public record FreightPackageDto(
        int height,
        int width,
        int length,
        int wight
) {
}
