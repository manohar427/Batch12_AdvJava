package com.test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class VerifyUser implements Filter {
    public VerifyUser() {
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		ServletOutputStream so = response.getOutputStream();
		String uname = request.getParameter("username");
		if("tester1".equalsIgnoreCase(uname)){
			so.println("User "+uname + " is Blocked");
		}else if("tester2".equalsIgnoreCase(uname)){
			so.println("User "+uname + " is not found in our DB");
		}else{
			chain.doFilter(request, response);
		}
		
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
