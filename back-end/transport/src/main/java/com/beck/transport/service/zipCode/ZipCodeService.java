package com.beck.transport.service.zipCode;

import com.beck.transport.dto.AddressInfoAPIData;
import com.beck.transport.dto.ZipCodeAPIResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZipCodeService {

    @Value("${api.zipCode.endpoint}")
    private String apiEndpoint;

    public AddressInfoAPIData getAddressByZipCode(String zipCode) {
        RestTemplate restTemplate = new RestTemplate();
        var apiResultInfo = restTemplate.getForEntity(String.format(apiEndpoint, zipCode), ZipCodeAPIResultDto.class);
        return new AddressInfoAPIData(apiResultInfo.getBody());
    }
}
