package com.beck.transport.dto.api.freight;

import com.google.gson.annotations.SerializedName;

public record FreightRequestDto(
      FreightFromToDto from,
      FreightFromToDto to,
      @SerializedName("package")
      FreightPackageDto packageInfo

) {
}
