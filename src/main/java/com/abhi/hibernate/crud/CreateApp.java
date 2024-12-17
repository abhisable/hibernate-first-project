package com.abhi.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abhi.entity.Address;
import com.abhi.entity.Student;
import com.abhi.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Address homeAddress = new Address();
		homeAddress.setAddressLine1("flat no 238");
		homeAddress.setAddressLine2("ramsagar marg");
		homeAddress.setCity("Betul");

		Address hostelAddress = new Address();
		hostelAddress.setAddressLine1("sdfad");
		hostelAddress.setAddressLine2("anadnagar");
		hostelAddress.setCity("Bhopal");

		Student student = new Student();
		student.setName("Rahul");
		student.setRollNo(5);
		student.setHomeAddress(homeAddress);
		student.setHostelAddress(hostelAddress);

		session.beginTransaction();

		session.save(student);

		session.getTransaction().commit();

	}
}
