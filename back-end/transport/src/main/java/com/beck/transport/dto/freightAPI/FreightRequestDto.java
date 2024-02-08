package com.beck.transport.dto.freightAPI;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.google.gson.annotations.SerializedName;

public record FreightRequestDto(
      FreightFromToDto from,
      FreightFromToDto to,
      @SerializedName("package")
      FreightPackageDto packageInfo

) {
}
