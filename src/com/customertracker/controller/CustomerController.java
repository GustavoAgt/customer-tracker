package com.customertracker.controller;

import java.util.Collections;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		Collections.sort(customerList);
	
		model.addAttribute("customers", customerList);
		
		return "list-customer";
	}
	
	@GetMapping("/showFormForAdd")
	public String addCustomers(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "create-customer-form";
	}
	
	@PostMapping("saveCustomer")
	public String saveCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
			
		if(bindingResult.hasErrors()) {
			//Logger customer
			return "create-customer-form";
		}
		
		customerService.addCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("{id}/update")
	public String getUserById(@PathVariable int id, Model model) {
		model.addAttribute(customerService.getCustomerById(id));
		return "update-customer-form";
	}
	
	@PostMapping("{id}/updateCustomer")
	public String updateUserById(@ModelAttribute("customer") Customer customer){
		customerService.updateCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@PostMapping("list/{id}/delete")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customer/list";
	} 
}


