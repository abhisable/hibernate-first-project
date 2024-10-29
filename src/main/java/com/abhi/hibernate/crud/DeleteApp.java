package com.abhi.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.abhi.entity.Song;
import com.abhi.utils.HibernateUtils;

public class DeleteApp 
{
    public static void main( String[] args )
    {
       
       SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
       Session session=sessionFactory.openSession();
       
       session.beginTransaction();
       Song song=session.get(Song.class, 1);
       session.remove(song);// delete deprecated
       session.getTransaction().commit();
       
       session.close();
       
       
    }
}
