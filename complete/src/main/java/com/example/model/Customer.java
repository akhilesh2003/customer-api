package com.example.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author akverma
 *
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable{
	
	private static final long serialVersionUID = -513157974899451673L;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="CUSTOMER_ID")
	private int customerId;

	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private Set<Address> address = new HashSet<Address>();
	
	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	/**
	 * no arg constructor
	 */
	public Customer() {}

	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNumber
	 * @param email
	 * @param address
	 */
	public Customer(String firstName, String lastName, long phoneNumber, String email,Set<Address> address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address= address;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
