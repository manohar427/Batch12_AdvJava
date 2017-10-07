<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form action="LoginServlet">
      
        <table>
           <tr>
              <td>Username</td>
              <td><input type="text" name="username"/></td>
           </tr>
           
           <tr>
              <td>Password</td>
              <td><input type="password" name="password"/></td>
           </tr>
           
           <tr>
              <td><input type="submit" value="Login"/></td>
           </tr>
        </table>
        
       
        
        <c:if test="${invalid =='YES' }">
            <label style="color: red">Invalid username/Password</label>
        </c:if>
        
      </form>
</body>
</html>