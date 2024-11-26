package com.maven.hibernate.Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricketer cricket = new Cricketer();
		cricket.setCname("Sachin");
		cricket.setScore(145);
		cricket.setJersey("India");
		Cricketer cricketer = new Cricketer("Ganguly",100,"India");
		Cricketer cricketer3= new Cricketer("Ponting",125,"Australia");
		Cricketer cricketer1 = new Cricketer("Kane",95,"New Zealand");
		Cricketer cricketer31= new Cricketer("Mark Boucher",56,"South Africa");
		Configuration con = new Configuration().configure("cache_config.cfg.xml").addAnnotatedClass(Cricketer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx= session.beginTransaction();
//		session.save(cricketer);
//		session.save(cricketer1);
//		session.save(cricketer31);
//		session.save(cricketer1);
		Cricketer c1= (Cricketer)session.get(Cricketer.class, "Kane"); //session will give object of Object //Call went to DB as 
																		//first level is not there, now DB creates First level cache
		System.out.println(c1);
		Cricketer c1= (Cricketer)session.get(Cricketer.class, "Kane"); //session will give object of Object
																	//Call goes to first level cache as first level cache is created in above step
		System.out.println(c1);
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sf.openSession();
		Transaction transaction = session2.beginTransaction();
		Cricketer c1=(Cricketer)session2.get(Cricketer.class, "kane");// Same object is called for 3d time but this time session is different 
																	// so First level cache is created for session 2 and 2 time DB is being hit
		System.out.println(c1);
		session2.getTransaction().commit();
		session2.close();
		
//				Hibernate: select c1_0.cname,c1_0.jersey,c1_0.score from Cricketer c1_0 where c1_0.cname=?
//				Cricket [cname=Kane, score=95, jersey=New Zealand]
//				Cricket [cname=Kane, score=95, jersey=New Zealand]
//				Hibernate: select c1_0.cname,c1_0.jersey,c1_0.score from Cricketer c1_0 where c1_0.cname=?
//				Cricket [cname=kane, score=95, jersey=New Zealand]
		

	}

}
