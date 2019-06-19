package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.register_service;
import modal.customerdetails;

//@WebServlet("/Register")
public class Registerservlet extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Here in register.java");
		
		  response.setContentType("text/html");
		  String name = request.getParameter("name"); 
		  String email = request.getParameter("email");
		  String phone = request.getParameter("phone"); 
		  String pass = request.getParameter("pass"); 
		  String gender = request.getParameter("gender");
		 customerdetails cd = new customerdetails();
		 cd.getname();
		 cd.getemail();
		 cd.getphone();
		 cd.getpass();
		 cd.getgender();
		 
		  register_service rs = new register_service(); 
		  boolean result=rs.insert(cd);
		  if(result==true)
		  { 
			  System.out.println("in if condition");
		  
			
			 RequestDispatcher rd = request.getRequestDispatcher("Registration");
			 rd.forward(request, response);
			 
		  }
		  else 
		  {
			  System.out.println("incorrect");
			  RequestDispatcher rd =request.getRequestDispatcher("registration.html"); rd.include(request,response); 
			  }
		 }
}
