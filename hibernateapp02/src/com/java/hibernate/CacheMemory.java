package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CacheMemory {

	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("Employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Object o=session.get(Employee.class,new Integer(1001));
		
		Employee e=(Employee)o;
		
		e.setFname("Rajesh");
		e.setFname("Raj");
		
		Transaction tx=session.beginTransaction();
		session.update(e);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("object updated sucessfully");
		
		
	}
}
