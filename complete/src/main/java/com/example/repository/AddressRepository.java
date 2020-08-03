package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;
import com.example.model.Customer;

/**
 * @author akverma
 *
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
		public Optional<Customer> findByCity(String name);
}
