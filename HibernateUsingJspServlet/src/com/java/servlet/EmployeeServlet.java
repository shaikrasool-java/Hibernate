package com.java.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.db.DBData;
import com.java.model.EmployeeModel;

public class EmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		
		System.out.println("****************************************");
		System.out.println("**********WLECOME TO SERVLET************");
		System.out.println("****************************************");
		DBData db=new DBData();
		List<EmployeeModel> getEmployeeModels =db.getAllEmployeeModels();
		
		req.setAttribute("employees", getEmployeeModels);
		RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
		rd.forward(req, res);
		


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
