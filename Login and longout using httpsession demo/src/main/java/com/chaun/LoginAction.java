package com.chaun;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginAction extends HttpServlet
{
	
    public LoginAction() 
    {
      
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		session.setAttribute("userName", userName);
		
		if(userName.equals("Chaun")&& password.equals("1234"))
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			response.sendRedirect("LoginPage.jsp?msg=invalid");
		}
		
		
		
	}

}
