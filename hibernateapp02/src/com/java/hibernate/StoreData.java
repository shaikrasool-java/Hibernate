package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {  
	      
	    //creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("employee.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	    
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Employee e1=new Employee();  
	    e1.setEid(1001);  
	    e1.setFname("rasool");  
	    e1.setLname("shaik");  
	      
	    session.save(e1);//persisting the object  
	    //session.persist(e1); save or persist both methods are to save the object only...
	    
	    
	    
	    t.commit();//transaction is committed  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	      
	}  

}
