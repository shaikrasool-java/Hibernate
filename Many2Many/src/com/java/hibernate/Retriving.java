package com.java.hibernate;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Retriving {

	public static void main(String[]args){
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();

		Object o=session.get(Student.class, new Integer(123));

		Student st=(Student)o;
		System.out.println("customer id: "+st.getSid());
		System.out.println("customer name: "+st.getSname());
		System.out.println("customer venid: "+st.getMarks());
		System.out.println("-------------");



		Set s=st.getCourses();
		Iterator it=s.iterator();

		while(it.hasNext()){
			Course c=(Course)it.next();
			System.out.println("course id: "+c.getCid());
			System.out.println("course name: "+c.getCname());
			System.out.println("course duration: "+c.getDuration());


			session.close();
			sf.close();
		}
	}
}
