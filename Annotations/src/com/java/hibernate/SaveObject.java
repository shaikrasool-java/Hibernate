package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveObject {
	
	
	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
	
		
		Students s=new Students();
		s.setSid(101);
		s.setSname("rajesh");
		s.setStandard(15);
		
		Transaction tx=session.beginTransaction();
		session.persist(s);
		tx.commit();
		System.out.println("object saved sucessfully.....");
		
		session.close();
		sf.close();
		
		
	}

}
