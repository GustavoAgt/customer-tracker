package com.customertracker.service;

import java.util.List;

import com.customertracker.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
}
