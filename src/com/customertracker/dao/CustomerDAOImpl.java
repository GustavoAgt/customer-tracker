package com.customertracker.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customertracker.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
			
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> customerQuery = session.createQuery("from Customer", Customer.class);
		List<Customer> customers = customerQuery.getResultList();
		
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer where id =:id", Customer.class);
		query.setParameter("id", id);
		return query.getSingleResult();
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Customer where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
}
