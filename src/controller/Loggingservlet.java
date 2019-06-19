package controller;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import Service.Validate;

@SuppressWarnings("serial")
public class Loggingservlet extends HttpServlet {
	 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        System.out.println("hi this is servlet");
        
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        if(Validate.checkUser(name, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("emplogin.html");
           rs.include(request, response);
        }
    }  
}
  
  
