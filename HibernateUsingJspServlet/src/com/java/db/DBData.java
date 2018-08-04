package com.java.db;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.java.model.EmployeeModel;

public class DBData {
	
	public List<EmployeeModel> getAllEmployeeModels(){
		List<EmployeeModel> emp=new ArrayList<>();
				FactoryConnection fc=new FactoryConnection();
				Session session=fc.getSessionFactory().openSession();
	
	
				Query query=session.createQuery("from EmployeeModel emp");
				emp =query.list(); 
	
				return emp;
	
	}
	

}
