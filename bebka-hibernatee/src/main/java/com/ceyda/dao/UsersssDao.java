package com.ceyda.dao;

import com.ceyda.model.Usersss;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersssDao {
    private SessionFactory sessionFactory;

    public UsersssDao(){
        this.sessionFactory=new Configuration().configure().buildSessionFactory();
    }
    public void createUser(Usersss usersss){
        Transaction transaction=null;
        try(Session session=sessionFactory.openSession()){
            transaction=session.beginTransaction();
            session.persist(usersss);
            transaction.commit();
            System.out.println("Kullanıcı eklendi."+ usersss.getName());
        } catch (Exception e) {
          if(transaction !=null) transaction.rollback();
          e.printStackTrace();
        }

    }
    public Usersss getUserById(long id){
        try(Session session=sessionFactory.openSession()){
           return session.get(Usersss.class, id);
        }
    }
    public void updateUser(Usersss usersss){
        Transaction transaction =null;
        try(Session session=sessionFactory.openSession()){
            transaction=session.beginTransaction();
            session.merge(usersss);
            transaction.commit();
            System.out.println("Kullanıcı güncellendi."+ usersss.getName());
        } catch (Exception e) {
            if(transaction !=null) transaction.rollback();
            e.printStackTrace();
        }
    }
    public void deleteUser(Usersss usersss){
        Transaction transaction=null;
        try(Session session=sessionFactory.openSession()){
            transaction=session.beginTransaction();
            session.remove(usersss);
            transaction.commit();
            System.out.println("Kullanıcı silindi."+ usersss.getName());
        } catch (Exception e) {
            if(transaction !=null) transaction.rollback();
            e.printStackTrace();
        }
    }




}
