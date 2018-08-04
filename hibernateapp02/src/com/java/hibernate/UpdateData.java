package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[]args){
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
	
	//	Object o=session.get(Employee.class, new Integer(1001));
	Object o=session.load(Employee.class, new Integer(1001));
		
		
		Employee e=(Employee)o;
		//e.setEid(101);
		e.setFname("Rasool");
		e.setLname("Nabi");
		Transaction tx=session.beginTransaction();
		session.update(e);
		tx.commit();
		session.close();
		
		sf.close();
		
		System.out.println("object updated sucessfully");
	
	}

}
