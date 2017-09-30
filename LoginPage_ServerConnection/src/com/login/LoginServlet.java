package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
	 * throws ServletException, IOException { System.out.println(
	 * "I am from service()"); }
	 */
	public LoginServlet() {
		System.out.println("I am from LoginServlet()");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// DB Connection
		validateUserDetails(username, password);

		ServletOutputStream os = response.getOutputStream();

		if ("12345".equals(username) && "abc".equals(password)) {
			System.out.println("User loggedin successfully..");
			os.println("User loggedin successfully..");
		} else {
			System.out.println("Invalid credentials");
			os.println("Invalid credentials");
		}

		System.out.println("I am from doGET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("I am from doPOST");
	}

	public void destroy() {
		System.out.println("I am from destroy()");
	}

	public boolean validateUserDetails(String un, String pwd) {
		// DB
		return true;
	}
}
