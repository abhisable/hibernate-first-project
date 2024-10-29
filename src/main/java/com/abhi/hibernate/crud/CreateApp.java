package com.abhi.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abhi.entity.Song;
import com.abhi.utils.HibernateUtils;

public class CreateApp 
{
    public static void main( String[] args )
    {
       
       SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
       Session session=sessionFactory.openSession();
       
       Song song1=new Song();
       
       song1.setId(5);
       song1.setSongName("ram ka gungan");
       song1.setArtist("Pt. Bhimsen");
       
       session.beginTransaction();
       session.persist(song1);
       session.getTransaction().commit();
  
        System.out.println("check your db data pushed succesfully");
        
        session.close();
       
       
    }
}
