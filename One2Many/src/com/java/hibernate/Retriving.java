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
		
		Object o=session.get(Vendor.class, new Integer(102));
		
		Vendor v=(Vendor)o;
		System.out.println("Vendor Name: "+v.getVname());
		System.out.println("vendor Id: "+v.getVid());
		
		Set s=v.getChildren();
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Customer c=(Customer)it.next();
			System.out.println("customer id: "+c.getCid());
			System.out.println("customer name: "+c.getCname());
			System.out.println("customer venid: "+c.getVenId());
			System.out.println("-------------");
		}
		session.close();
		sf.close();
		
		
		
	}

}
