package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.AddressRepository;
import com.example.repository.CustomerRepository;

/**
 * @author akverma
 *
 */
@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	/**
	 * @return all Customer
	 */
	public Iterable<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	/**
	 * @param id
	 * @return Customer
	 */
	public Optional<Customer> getCustomer(int id) {
		return customerRepository.findById(id);
	}

	/**
	 * @param customer
	 * @return 
	 */
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	/**
	 * @param name
	 * @return list of Customer
	 */
	public Optional<Customer> getCustomersByCity(String name) {
		return addressRepository.findByCity(name);
	}
	
	/**
	 * @param prefix
	 * @return List<Customer>
	 */
	public List<Customer> getCustomersByPhoneNumber(long prefix) {
		
		 Iterable<Customer> findAll = customerRepository.findAll();
		 List<Customer> result = new ArrayList<Customer>(); 
		 for (Customer customer : findAll) {
			if(String.valueOf(customer.getPhoneNumber()).startsWith(String.valueOf(prefix))) {
				result.add(customer);
			}
		}
		 return result;
	}
}
