package com.example.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author akverma
 *
 */
@Entity
@Table(name = "address")
public class Address implements Serializable{
	
	private static final long serialVersionUID = -513157324599451673L;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int addressId;
	
	private String addressType;
	private String city;
	private String country;
	private String detailAddress;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	/**
	 * no arg constructor
	 */
	public Address() {}
	
	/**
	 * @param addressType
	 * @param city
	 * @param country
	 * @param detailAddress
	 * @param customer
	 */
	public Address(String addressType, String city, String country, String detailAddress, Customer customer) {
		super();
		this.addressType = addressType;
		this.city = city;
		this.country = country;
		this.detailAddress = detailAddress;
		this.customer = customer;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
