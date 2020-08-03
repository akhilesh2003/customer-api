package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Address;
import com.example.repository.AddressRepository;

/**
 * @author akverma
 *
 */
@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * @param id
	 * @param address
	 * @return Address
	 */
	public Address createCustomerAddress(int id, Address address) {
		return addressRepository.save(address);
	}
	
	/**
	 * @param cid
	 * @param aid
	 */
	public void deleteCustomerAddress(int cid, int aid) {
		addressRepository.deleteById(aid);
	}

}
