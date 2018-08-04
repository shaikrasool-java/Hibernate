package com.java.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2Many {

	public static void main(String[]args){

		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();

		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("rasool");
		s1.setMarks(100);

		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("lucky");
		s2.setMarks(100);

		Student s3=new Student();
		s3.setSid(103);
		s3.setSname("Rajesh");
		s3.setMarks(100);
		
		Course c=new Course();
		c.setCid(123);
		c.setCname("java");
		c.setDuration(180);


		Course c1=new Course();
		c1.setCid(132);
		c1.setCname("python");
		c1.setDuration(190);

		Course c2=new Course();
		c2.setCid(144);
		c2.setCname("oracle");
		c2.setDuration(108);


		Set s=new HashSet();
		s.add(c);
		s.add(c1);
		s.add(c2);
		s1.setCourses(s);
		s2.setCourses(s);
		s3.setCourses(s);
		

		Transaction tx=session.beginTransaction();
	session.save(s1);
	session.save(s2);
	session.save(s3);
	tx.commit();
	System.out.println("entities are stores sucessfuully......");
	session.close();
	sf.close();
	
	}


}
