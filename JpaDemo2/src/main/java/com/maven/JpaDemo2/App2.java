package com.maven.JpaDemo2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setName("Bumrah");
        studentinfo.setRoll(4);
        studentinfo.setMarks(50);
        
        System.out.println(studentinfo);
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
//        Studentinfo studentinfo2=entityManager.find(Studentinfo.class, 3);
//        System.out.println(studentinfo2);
        
        entityManager.getTransaction().begin();
        entityManager.persist(studentinfo); // this will just persist the info, inorder to save to DB we have to begin txn and commit it
        entityManager.getTransaction().commit();
        System.out.println(entityManager.find(Studentinfo.class, 4));
        
      // now the value is save to DB
        
    }
}
