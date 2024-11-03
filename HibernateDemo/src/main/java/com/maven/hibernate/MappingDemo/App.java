package com.maven.hibernate.MappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop();
		l1.setLid(101);
		l1.setLname("Dell");
		
		Laptop l2=new Laptop();
		l2.setLid(102);
		l2.setLname("Hp");

		Student s1= new Student();
		s1.setSroll(1);
		s1.setSname("Yash");
		s1.setSmarks(98);
		s1.getLaptops().add(l1);
//		s1.getLaptops().add(l2);
		
		System.out.println(l1);System.out.println(s1);
		
		
		Configuration con = new Configuration().configure("mapping.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(registry);
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(l1);
		session.save(s1);
		session.getTransaction().commit();
		
	}

}
