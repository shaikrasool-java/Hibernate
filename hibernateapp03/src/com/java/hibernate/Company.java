package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {

	public static void main(String[]args){
		
		
		Configuration con=new Configuration();
		con.configure("employee.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee e=new Employee();
		//e.setId(101);here no need give id coz of we had given in mapping "increment" operator
		e.setName("Shaik Rasool");
		
		RegularEmployee re=new RegularEmployee();
		re.setName("Rasool");
		re.setSalary(25000);
		re.setBonus(2500);
		
		ContractEmployee ce=new ContractEmployee();
		ce.setName("Rajesh");
		ce.setPayPerHour(500);
		ce.setContractDuration("6 months");
		
		Transaction tx=session.beginTransaction();
		session.persist(e);
		session.persist(re);
		session.persist(ce);
		
		tx.commit();
		
		
		System.out.println("object saved sucessfully...");
		
		session.close();
		sf.close();
	}
}
