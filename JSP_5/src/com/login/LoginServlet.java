package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		System.out.println("Do get method");
		
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		
		
		if("1234".equals(un) && "abc".equals(pw)){
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			request.setAttribute("invalid", "YES");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	
	}

	

}
