package com.ceyda;

import com.ceyda.model.Student;
import com.ceyda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;

        try{
            transaction=session.beginTransaction();

            Student student= new Student("Ceyda","KABA");

            session.persist(student);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}