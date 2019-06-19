package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.openaccount_service;
import modal.customerdetails;

@WebServlet("/OPENACC")
public class openaccountservlet extends HttpServlet 
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Here in openaccount.java");
		
		  response.setContentType("text/html");
		  String name = request.getParameter("name"); 
		  String email = request.getParameter("email");
		  String phone = request.getParameter("phone");  
		  String gender = request.getParameter("gender");
		  String aadhar = request.getParameter("aadhar");
		  String aadharno = request.getParameter("aadharno");
		  String age= request.getParameter("age");
		  String dob = request.getParameter("dob");
		  String customerid = request.getParameter("customerid");
		  
		 customerdetails cd = new customerdetails();
		 cd.getname();
		 cd.getemail();
		 cd.getphone();
		 cd.getgender();
		 cd.getaadhar();
		 cd.getaadharno();
		 cd.getage();
		 cd.getcustomerid();
		 
		 
		  register_service rs = new register_service(); 
		  boolean result=rs.insert(cd);
		  if(result==true)
		  { 
			  System.out.println("in if condition");
		  
			
			 RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			 rd.forward(request, response);
			 
		  }
		  else 
		  {
			  System.out.println("incorrect");
			  RequestDispatcher rd =request.getRequestDispatcher("open account.html"); rd.include(request,response); 
			  }
		 }
}
