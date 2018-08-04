package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveDate {

	public static void main(String[]args){
		
		Configuration  con=new Configuration();
		con.configure("employee.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		

	    Object o=session.get(Employee.class, new Integer(1001));
	    Employee e=(Employee)o;
	    System.out.println("eid: "+e.getEid());
	    System.out.println("fname: "+e.getFname());
	    System.out.println("lname: "+e.getLname());
	      
	    session.persist(e);
	    session.close();
	    System.out.println("object retrived sucessfully...");
		
		
	}
}
 