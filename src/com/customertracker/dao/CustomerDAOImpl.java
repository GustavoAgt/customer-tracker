package com.customertracker.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customertracker.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {
			
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> customerQuery = session.createQuery("from Customer", Customer.class);
		
	
		List<Customer> customers = customerQuery.getResultList();
		
		return customers;
	}

}
