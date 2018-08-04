package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Versioning {

	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Employee e=new Employee();
	e.setEid(101);
	e.setFname("shaik");
	e.setLname("Rasool");
	Transaction tx=session.beginTransaction();
	session.save(e);
	tx.commit();
	session.close();
	sf.close();
	System.out.println("object saved sucessfully....");
	
	
	}
	
}
