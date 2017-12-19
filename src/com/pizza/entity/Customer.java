package com.pizza.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private long customerId;
	private String customerName;
	private String phoneNumber;
	private Address address;
	private String userName;
	private String passWord;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String customerName, String phoneNumber, Address address, String userName,
			String passWord) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.userName = userName;
		this.passWord = passWord;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
	