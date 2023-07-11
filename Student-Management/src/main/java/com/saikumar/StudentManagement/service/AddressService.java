package com.saikumar.StudentManagement.service;

import com.saikumar.StudentManagement.model.Address;
import com.saikumar.StudentManagement.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
   @Autowired
    IAddressRepo iAddressRepo;

    public void createAddress(Address address) {
        iAddressRepo.save(address);
    }
}
