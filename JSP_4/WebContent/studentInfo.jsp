<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="PPP" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   <table width="700px" border="1" bgcolor=#23bc23>

		<tr>
			<td>Name</td>
			<td>${fname}</td>
		</tr>

		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>

        <tr>
			<td>Phone</td>
			<td>${phone}</td>
		</tr>
         <tr>
			<td>Gender</td>
			<td>${gender}</td>
		</tr>
		
		<tr>
			<td>Skills</td>
			<td>
			   <ul>
			  <PPP:forEach var="skill" items="${skills}">
			      <li>
			     ${skill}
			     </li>
			  </PPP:forEach>
			  </ul>
			</td>
		</tr>
		
		
        <tr>
			<td>Country</td>
			<td>
			    ${country}
			</td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td>
			    ${address}
			</td>
		</tr>
	</table>
	
	
</body>
</html>