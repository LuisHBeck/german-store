package com.beck.transport.dto.api.freight;

import com.google.gson.annotations.SerializedName;

public record FreightResponseDto(
        String name,
        String price,
        @SerializedName("delivery_time")
        String deliveryTime
) {
}
