package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;


/**
 * @author akverma
 *
 */
@RestController
@RequestMapping(path="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	/**
	 * @return all customer
	 */
	@GetMapping(path="")
	public @ResponseBody Iterable<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	
	/**
	 * @param id
	 * @return Customer
	 */
	@GetMapping(path="/{id}")
	public @ResponseBody Optional<Customer> getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomer(id);
	}

	@PostMapping(path="")
	public @ResponseBody Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	/**
	 * @param name
	 * @return Customer
	 */
	@GetMapping(path="/city/{name}")
	public @ResponseBody Optional<Customer> getCustomersByCity(@PathVariable("name") String name) {
		return customerService.getCustomersByCity(name);
	}
	
	
	/**
	 * @param prefix
	 * @return List<Customer>
	 */
	@GetMapping(path="/phone/{prefix}")
	public @ResponseBody List<Customer> getCustomersByPhoneNumber(@PathVariable("prefix") long prefix) {
		return customerService.getCustomersByPhoneNumber(prefix);
	}
}
