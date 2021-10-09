package com.chaun;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class LogoutAction extends HttpServlet 
{
	
    public LogoutAction()
    {
        
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		HttpSession session=request.getSession();
		session.removeAttribute("userName");
		session.invalidate();
		response.sendRedirect("LoginPage.jsp");
		
		
	}

}
