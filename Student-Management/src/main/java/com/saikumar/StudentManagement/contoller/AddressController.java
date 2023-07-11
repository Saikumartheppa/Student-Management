package com.saikumar.StudentManagement.contoller;

import com.saikumar.StudentManagement.model.Address;
import com.saikumar.StudentManagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public void createAddress(@RequestBody Address address){
        addressService.createAddress(address);
    }
}
