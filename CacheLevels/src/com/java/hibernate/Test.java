package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[]args){

		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();

		Emp e=(Emp)session.load(Emp.class, new Integer(111));
		System.out.println(e.getEname());
		session.close();

		try {
			Thread.sleep(6000);
		} catch (Exception e2) {

			System.out.println(e2.getMessage());
		}
		
		Session session1=sf.openSession();
		Emp e3=(Emp)session1.load(Emp.class, new Integer(111));
		System.out.println(e3.getEname());
		session1.close();

		Session session2=sf.openSession();
		Emp e4=(Emp)session1.load(Emp.class, new Integer(111));
		System.out.println(e4.getEname());
		session2.close();
		
	}
}
