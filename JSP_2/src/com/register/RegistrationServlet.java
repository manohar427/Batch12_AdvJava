package com.register;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String skills[] = request.getParameterValues("skills");
		String country = request.getParameter("country");
		String address = request.getParameter("address");
		
		
		request.setAttribute("fname", fname);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		request.setAttribute("gender", gender);
		request.setAttribute("skills", Arrays.toString(skills));
		request.setAttribute("country", country);
		request.setAttribute("address", address);
		
		request.getRequestDispatcher("studentInfo.jsp").forward(request, response);
		
		
	}

	

}
