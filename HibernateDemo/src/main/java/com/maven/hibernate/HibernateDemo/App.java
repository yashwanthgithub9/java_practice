package com.maven.hibernate.HibernateDemo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


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
        emp.setName("Virat");
        emp.setRole("Manager");
        
        try {
			Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx= session.beginTransaction();
			session.save(emp);
			tx.commit();
			Employee Emp1=session.get(Employee.class, 45);
			System.out.println(Emp1);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Hibernate Exception occured");
		}
        
    }
}
