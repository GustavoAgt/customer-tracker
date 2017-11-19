package com.customertracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer implements Comparable<Customer>{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message="Field first name should not be empty")
	@Size(min=2, message="First Name minimun length size is two")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message="Field last name should not be empty")
	@Size(min=2, message="Last Name minimun length size is two")
	@Column(name="last_name")
	private String lastName;
	
	@NotNull(message="Field email should not be empty")
	@Column(name="email")
	private String email;
	
	public Customer() {}

	public Customer(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName.equals(""))
			firstName = null;
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName.equals(""))
			lastName = null;
		
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.equals(""))
			email = null;
		
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Customer customer) {
		char firstCharAtString = customer.getLastName().charAt(0);
		return this.getLastName().charAt(0) - firstCharAtString;
	}	
}
