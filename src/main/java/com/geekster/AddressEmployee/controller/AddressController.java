package com.geekster.AddressEmployee.controller;

import com.geekster.AddressEmployee.model.Address;
import com.geekster.AddressEmployee.service.AddressService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/V1/Addresses")
@AllArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @GetMapping(value = "/addresses")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping(value = "/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping(value = "/address")
    public Address createAddress(@Valid @RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping(value = "/{id}")
    public Address updateAddress(@PathVariable Long id, @Valid @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
    }
}