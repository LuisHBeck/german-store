package com.beck.transport.service;

import com.beck.transport.dto.AddressDetailingData;
import com.beck.transport.dto.AddressRequestDto;
import com.beck.transport.model.Address;
import com.beck.transport.repository.AddressRepository;
import com.beck.transport.service.zipCode.ZipCodeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ZipCodeService zipCodeService;


    @Transactional
    public AddressDetailingData createAddress(AddressRequestDto addressDto) {
        var zipCodeAPIInfo = zipCodeService.getAddressByZipCode(addressDto.zipCode());
        var address = new Address(zipCodeAPIInfo, addressDto.number());
        System.out.println(address);
        addressRepository.save(address);

        return new AddressDetailingData(address);
    }
}
