package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MergeMethod {

	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Object o=session.get(Employee.class, new Integer(1001));
		Employee e=(Employee)o;
		
		e.setFname("Rajesh");
		session.close();
		
		
		
		Session session1=sf.openSession();
		Object ob=session1.get(Employee.class, new Integer(1001));
		Transaction tx=session1.beginTransaction();
		
		session1.merge(e);
		
		tx.commit();
		
		session1.close();
		
		sf.close();
		
		
	}
}
