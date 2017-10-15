package com.test;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class UserSessionListoner implements HttpSessionListener {

	int totalActiveUsers = 0;
   
    public UserSessionListoner() {
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
    	totalActiveUsers = totalActiveUsers + 1;
    	
    	System.out.println("Total Actove Users:"+totalActiveUsers);
    	
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	totalActiveUsers = totalActiveUsers - 1;
    	
    	System.out.println("Total Actove Users:"+totalActiveUsers);
    }
	
}
