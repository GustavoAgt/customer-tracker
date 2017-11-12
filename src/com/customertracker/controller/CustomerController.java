package com.customertracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.customertracker.entity.Customer;
import com.customertracker.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		List<Customer> customerList = customerService.getCustomers();
		model.addAttribute("customers", customerList);
		
		return "list-customer";
	}
	
	@RequestMapping("/showFormForAdd")
	public String addCustomers(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "create-customer-form";
	}
}
