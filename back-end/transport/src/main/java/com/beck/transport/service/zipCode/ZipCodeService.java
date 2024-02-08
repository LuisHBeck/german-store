package com.beck.transport.service.zipCode;

import com.beck.transport.dto.api.viacep.AddressInfoAPIData;
import com.beck.transport.dto.api.viacep.ZipCodeAPIResultDto;
import com.beck.transport.dto.api.freight.FreightFromToDto;
import com.beck.transport.dto.api.freight.FreightPackageDto;
import com.beck.transport.dto.api.freight.FreightRequestDto;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ZipCodeService {

    @Value("${api.zipCode.viacep.endpoint}")
    private String apiViacepEndpoint;

    @Value("${api.zipCode.melhorEnvio.endpoint}")
    private String apiMelhorEnvioEndpoint;

    @Value("${api.zipCode.melhorEnvio.token}")
    private String apiMelhorEnvioToken;

    @Value("${api.zipCode.melhorEnvio.shippingCompanyZipCode}")
    private String shippingCompanyZipCode;

    @Autowired
    private Gson gson;


    public AddressInfoAPIData getAddressByZipCode(String zipCode) {
        RestTemplate restTemplate = new RestTemplate();
        var apiResultInfo = restTemplate.getForEntity(String.format(apiViacepEndpoint, zipCode), ZipCodeAPIResultDto.class);
        return new AddressInfoAPIData(apiResultInfo.getBody());
    }

    public void getFreightByZipCode(String zipCode) throws URISyntaxException, IOException, InterruptedException {
        FreightRequestDto freightDto = new FreightRequestDto(
                new FreightFromToDto(shippingCompanyZipCode),
                new FreightFromToDto(zipCode),
                new FreightPackageDto(10, 20, 15, 1)
        );
        var freightDtoJSON = gson.toJson(freightDto);

        HttpRequest freightRequest = HttpRequest.newBuilder()
                .uri(new URI(apiMelhorEnvioEndpoint))
                .header("Authorization", apiMelhorEnvioToken)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(freightDtoJSON)).build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = httpClient.send(freightRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
    }
}
