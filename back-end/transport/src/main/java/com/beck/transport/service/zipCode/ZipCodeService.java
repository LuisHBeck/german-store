package com.beck.transport.service.zipCode;

import com.beck.transport.dto.AddressInfoAPIData;
import com.beck.transport.dto.ZipCodeAPIResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZipCodeService {

    public AddressInfoAPIData getAddressByZipCode(String zipCode) {
        RestTemplate restTemplate = new RestTemplate();
        var apiResultInfo = restTemplate.getForEntity(String.format("http://viacep.com.br/ws/%s/json", zipCode), ZipCodeAPIResultDto.class);
        return new AddressInfoAPIData(apiResultInfo.getBody());
    }
}
