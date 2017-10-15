package com.test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class VerifyBadUser implements Filter {

    public VerifyBadUser() {
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		request.setAttribute("currencyVal", "64.56");
		
		
		chain.doFilter(request, response);
		ServletOutputStream so = response.getOutputStream();
		String uname = request.getParameter("username");
		if("tester3".equalsIgnoreCase(uname)){
			so.println("User "+uname + " is Flound as Terrosit/found in money land");
		}else{
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
