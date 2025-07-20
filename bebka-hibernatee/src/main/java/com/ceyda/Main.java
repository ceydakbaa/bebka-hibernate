package com.ceyda;

import com.ceyda.dao.UsersssDao;
import com.ceyda.model.Usersss;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Session session= HibernateUtil.getSessionFactory().openSession();
//    }
//        Transaction transaction=null;

//        try{
//            transaction=session.beginTransaction();

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
//            transaction.commit();
//        } catch (Exception e) {
//            if(transaction !=null) transaction.rollback();
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
          //UserDao Ticket'ı buradan başlıyor
      UsersssDao usersssDao=new UsersssDao();
//       Usersss newUsersss = new Usersss("Elif","elif@gmail.com");
//       usersssDao.createUser(newUsersss);

//        long userId1=newUsersss.getId();
//       System.out.println("Kayıtlı Kullanıcı Id"+userId1);

//        Usersss foundUser=usersssDao.getUserById(userId1);
//        if (foundUser !=null){
//            System.out.println("Bulunan Kullanıcı Id:"+foundUser.getId()+"İsim:"+foundUser.getName()+"Email:"+foundUser.getEmail());
//        }else{
//            System.out.println("Kullanıcı Bulunamadı.");
//        }

 //       long updateToId=1L;
 //       Usersss UserToUpdate=usersssDao.getUserById(updateToId);
 //       if(UserToUpdate !=null){
 //           System.out.println("Güncellenen Kullanıcı: "+UserToUpdate.getName());
 //           UserToUpdate.setName("Merve");
 //           usersssDao.updateUser(UserToUpdate);
 //           System.out.println("Kullanıcı Güncellendi.");
 //       }else{
 //           System.out.println("Kullanıcı Güncellenemedi.");
 //       }
             long idForDelete=1L;
        Usersss foundUserToDelete=usersssDao.getUserById(idForDelete);
        if(foundUserToDelete !=null){
            System.out.println("Silinecek Kullanıcı :"+ foundUserToDelete.getId());
            usersssDao.deleteUser(foundUserToDelete);
            System.out.println("Kullanıcı Silindi ."+ foundUserToDelete.getId());
        }else{
            System.out.println("Kullanıcı Silinemedi.");
        }





    }
}