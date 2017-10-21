package com.customertracker.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryBuilder {
	public SessionFactory getSessionFactory() {
		SessionFactory session = new Configuration().configure().
				buildSessionFactory();
		return null;
	}
}
