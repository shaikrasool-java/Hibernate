package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TimeStamp {
	
	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Employee e=new Employee();
	
		e.setEid(111);
		e.setFname("raje");
		e.setLname("lucky");
		
		Transaction tx=session.beginTransaction();
		session.save(e);
		
		tx.commit();
		System.out.println("object saved sucessfully");
		session.close();
		sf.close();
		
	}

}
