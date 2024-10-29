package com.abhi.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhi.entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration =new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Song.class);
			
			sessionFactory=configuration.buildSessionFactory();
		}
		return sessionFactory;
		
	}
	
	
}
