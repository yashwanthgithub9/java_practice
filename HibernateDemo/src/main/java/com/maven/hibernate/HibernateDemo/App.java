package com.maven.hibernate.HibernateDemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee emp = new Employee();
        emp.setEmpid(18);
        emp.setName("Virat Kohli");
        emp.setRole("Manager");
        
        try {
			Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx= session.beginTransaction();
			session.save(emp);
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Hibernate Exception occured");
		}
        
    }
}
