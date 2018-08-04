package com.java.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class FactoryConnection {

	private SessionFactory factory=null;

	public SessionFactory getSessionFactory(){
		
		if(this.factory==null){
			
			Configuration con=new AnnotationConfiguration().configure();
			this.factory=con.buildSessionFactory();
		}
		return this.factory;
	}
}
