package com.java.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2ManyTest01 {


	public static void main(String[]args){

		Configuration con=null;
		SessionFactory sf=null;
		Session session=null;

		con=new Configuration();
		con.configure("hibernate.cfg.xml");
		sf=con.buildSessionFactory();
		session=sf.openSession();


		Vendor v=new Vendor();
		v.setVid(102);
		v.setVname("Chinni");


		Customer cp=new Customer();
		cp.setCid(101);
		cp.setCname("Rajesh");

		Customer cp1=new Customer();
		cp1.setCid(201);
		cp1.setCname("Reddy");
		
		Customer c1=new Customer();
		c1.setCid(301);
		c1.setCname("Nabi");
		
		Customer c2=new Customer();
		c2.setCid(401);
		c2.setCname("Lucky");

		Set s=new HashSet();
		s.add(cp);
		s.add(cp1);
		s.add(c1);
		s.add(c2);
		
		v.setChildren(s);

		Transaction tx=session.beginTransaction();
		session.save(v);

		tx.commit();
		System.out.println("entities are stored sucessffully...");

		session.close();
		sf.close();





	}
}
