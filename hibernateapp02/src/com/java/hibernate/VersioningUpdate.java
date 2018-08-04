package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VersioningUpdate {


	public static void main(String[]args){
		
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Object o=session.load(Employee.class, new Integer(1001));
		Employee e=(Employee)o;
		e.setFname("rajiS");
		Transaction t=session.beginTransaction();
		session.update(e);
		t.commit();
		
		session.close();
		sf.close();
		System.out.println("object modified sucessfully");
	}
}
