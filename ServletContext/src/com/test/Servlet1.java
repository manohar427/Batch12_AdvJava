package com.test;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet1() {
      
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc = getServletConfig();
		ServletContext sctx =  sc.getServletContext();
		
		String discount = sctx.getInitParameter("discount");
		
		Enumeration<String> enums = sctx.getInitParameterNames();
		
		response.getOutputStream().println("Param Name and Value from Servlet 1:<br/>");
		while(enums.hasMoreElements()){
			
			String paranName = enums.nextElement();
			String paramvalue = sctx.getInitParameter(paranName);
			
			response.getOutputStream().println("Param Name:"+paranName+",Param Value:"+paramvalue+"<br/>");
			
		}
		
		//response.getOutputStream().println("Discount value from Servlet 1:"+discount);
		
		request.getRequestDispatcher("Servlet2").include(request, response);
	}

	

}
