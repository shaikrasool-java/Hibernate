package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2OneTest01 {

	public static void main(String[]args){
		
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Vendor v=new Vendor();
		v.setVid(101);
		v.setVname("Lucky");
		
		Customer c=new Customer();
		c.setCid(1001);
		c.setCname("Chinni");
		c.setParent(v);
		
		Customer c1=new Customer();
		c1.setCid(1002);
		c1.setCname("Hp");
		c1.setParent(v);
		
		Customer c2=new Customer();
		c2.setCid(1003);
		c2.setCname("IBM");
		c2.setParent(v);
		
		session.save(c);
		session.save(c1);
		session.save(c2);
		tx.commit();
		System.out.println("entyties are stored sucessfully...");
	session.close();
	sf.close();
	
	}
}
