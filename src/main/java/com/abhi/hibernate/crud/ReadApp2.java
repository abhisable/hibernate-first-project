package com.abhi.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.abhi.entity.Employee;
import com.abhi.utils.HibernateUtils;

public class ReadApp2 {
	private static Session session = null;

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		session = sessionFactory.openSession();

		

		//getAllStudents();
		getStudentsByAge(20,30);

		session.close();

	}

	private static void getStudentsByAge(int i, int j) {
		//String hql = "from Employee e where e.age between ?1 and ?2";
		String hql = "from Employee e where e.age between :MIN and :MAX";
        session.beginTransaction();
        
        Query<Employee> query = session.createQuery(hql,Employee.class);
        query.setParameter("MIN", i);
        query.setParameter("MAX", j);
        List<Employee> list = query.list();
        list.forEach(System.out::println);
		
	}

	private static void getAllStudents() {
		String query = "from Employee";
        session.beginTransaction();
        
        Query<Employee> query2 = session.createQuery(query,Employee.class);
        List<Employee> list = query2.list();
        list.forEach(System.out::println);

	}
}
