package com.ceyda;

import com.ceyda.model.Student;
import com.ceyda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=null;

        try{
            transaction=session.beginTransaction();

 //           Student student= new Student("Ceyda","KABA");
//            session.persist(student);
          //READ ticketı
//            Student foundstudent= session.get(Student.class,1);
//          if(foundstudent !=null){
//              System.out.println("Student Found "+foundstudent.getName());
//          }else{
//              System.out.println("There is no student with this name. ");
//          }
//
//            List<Student>studentList=session.createQuery("From Students"+Student.class).list();
//            System.out.println("Tüm Öğrenciler");
//          for(Student student : studentList){
//              System.out.println(student);
//          }

            //Update Ticket'ı
 //           Student studentToUpdate= session.get(Student.class,1);
 //           if(studentToUpdate !=null){
 //               studentToUpdate.setName("Elif");
 //           }

            //Delete Ticket'ı
//            Student studentToDelete=session.get(Student.class,2);
//            if(studentToDelete !=null){
//                session.remove(studentToDelete);
//                System.out.println("Öğrenci Başarıyla Silindi.");
//        }else{
//                System.out.println("Silinecek Öğrenci Bulunamadı.");
//            }

            //

        UserDao userDao=new UserDao();
        Usersss newUsersss = new Usersss("Elif","elif@gmail.com");
        userDao.createUser(newUsersss);








            transaction.commit();
        } catch (Exception e) {
            if(transaction !=null) transaction.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}