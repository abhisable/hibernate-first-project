package com.abhi.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhi.entity.Employee;
import com.abhi.entity.Song;
import com.abhi.entity.Student;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration =new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Employee.class);
			
			sessionFactory=configuration.buildSessionFactory();
		}
		return sessionFactory;
		
	}
	
	
}
