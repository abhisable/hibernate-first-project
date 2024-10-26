package com.abhi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
       
       Configuration configuration=new Configuration();
       configuration.configure("hibernate.cfg.xml");
       configuration.addAnnotatedClass(Song.class);
       
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       Session session=sessionFactory.openSession();
       
       Song song1=new Song();
       
       song1.setId(4);
       song1.setSongName("gulo m rang bhare");
       song1.setArtist("Mehndi Hassan");
       
       session.beginTransaction();
       session.persist(song1);
       session.getTransaction().commit();
  
        System.out.println("check your db data pushed succesfully");
       
       
    }
}
