package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

/**
 * @author akverma
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
}
