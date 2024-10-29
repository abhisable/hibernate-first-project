package com.abhi.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abhi.entity.Song;
import com.abhi.utils.HibernateUtils;

public class UpdateApp 
{
    public static void main( String[] args )
    {
       
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Song song=session.get(Song.class, 2);  
        song.setSongName("TU MILE DIL KHILE - Updated");   
        
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        
        System.out.println(session.get(Song.class, 2));
        session.close();
       
       
    }
}
