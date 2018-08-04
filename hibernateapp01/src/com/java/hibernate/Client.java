package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	
	static public void main(String[]args){
		System.out.println("main method");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Client.class);
		System.out.println("configured");
		
/*		con.configure("hibernate.cfg.xml");
*/		System.out.println("cfg file configured");
		System.out.println(".....");
		
		SessionFactory sf=con.buildSessionFactory();
		System.out.println("build session factory....");
		
		Session s=sf.openSession();
		System.out.println("session is created");
		
		Product p=new Product();
		System.out.println("product object is created");
		
		p.setPid(101);
		p.setPname("apple");
		p.setPrice(1000);
		
		Transaction tx=s.beginTransaction();
		
		s.save(p);
		tx.commit();
		System.out.println("object saved sucessfully");
		s.close();
		sf.close();
		
	}
}
