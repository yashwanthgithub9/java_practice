package com.maven.JpaDemo2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Studentinfo studentinfo = new Studentinfo();
        studentinfo.setName("Bumrah");
        studentinfo.setRoll(11);
        studentinfo.setMarks(50);
        
        System.out.println(studentinfo);
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        Studentinfo studentinfo2=entityManager.find(Studentinfo.class, 2);
        System.out.println(studentinfo2);
    }
}
