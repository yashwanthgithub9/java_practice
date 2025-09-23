package com.maven.JpaDemo2;

import org.hibernate.Remove;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 */
public class App2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Studentinfo studentinfo = new Studentinfo("Virat",18);
        Studentinfo studentinfo1 = new Studentinfo("Rohit",45);        
        Studentinfo studentinfo2 = new Studentinfo("Gill",77);        
        Studentinfo studentinfo3 = new Studentinfo("Abhishek",23);        

//        studentinfo.setName("Hardik");
//        studentinfo.setMarks(50);
        
        System.out.println(studentinfo);
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
//        Studentinfo studentinfo2=entityManager.find(Studentinfo.class, 3);
//        System.out.println(studentinfo2);
/*       
        entityManager.getTransaction().begin();
        // this is creating rows with incremental roll but duplicate names every time application is running
        // need to set up unique constraint on name as well;
        entityManager.persist(studentinfo); // this will just persist the info, inorder to save to DB we have to begin txn and commit it
        entityManager.persist(studentinfo1); // this will just persist the info, inorder to save to DB we have to begin txn and commit it
        entityManager.persist(studentinfo2); // this will just persist the info, inorder to save to DB we have to begin txn and commit it
        entityManager.persist(studentinfo3); // this will just persist the info, inorder to save to DB we have to begin txn and commit it
        Studentinfo s= entityManager.find(Studentinfo.class, 1);
        s.setName("Virat Kohli");
        
        
        entityManager.getTransaction().commit();
        entityManager.close();
//        System.out.println(entityManager.find(Studentinfo.class, 5));
        
      // now the value is save to DB
        */
        //Merge operation
        //1. create entity manager
        EntityManager em= entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        //2. Find entity and detach 
        Studentinfo studentinfo4=em.find(Studentinfo.class, 1);
//        em.getTransaction().commit();
        em.close();
        // 3. Update value
        studentinfo4.setName("Virat Kohli(Updated Name using merge)");
        // 4. new entity manager
        EntityManager em1=entityManagerFactory.createEntityManager();
        em1.getTransaction().begin();
        Studentinfo s1=em1.merge(studentinfo4);
        em1.getTransaction().commit();
        em1.close();
        
        
        
    }
}
