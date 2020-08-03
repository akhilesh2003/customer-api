package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.service.AddressService;

/**
 * @author akverma
 *
 */
@RestController
@RequestMapping(path="/customer/{id}/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	/**
	 * @param id
	 * @param address
	 * @return Address
	 */
	@PostMapping(path="")
	public @ResponseBody Address createCustomerAddress(@PathVariable("id") int id, @RequestBody Address address) {
		return addressService.createCustomerAddress(id, address);
	}
	
	/**
	 * @param customerId
	 * @param addressId
	 */
	@DeleteMapping(path="/{id}")
	public void deleteCustomerAddress(@PathVariable("id") int cid, @PathVariable("id") int aid) {
		addressService.deleteCustomerAddress(cid, aid);
	}
}
