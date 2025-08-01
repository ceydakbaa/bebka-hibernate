package com.ceyda.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static{
        try{
            sessionFactory =new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }



}
