package com.customertracker.dao;

import java.util.List;

import com.customertracker.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void updateCustomer(Customer customer);
}
