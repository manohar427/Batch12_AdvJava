<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   <table width="700px" border="1" bgcolor=#23bc23>

		<tr>
			<td>Name</td>
			<td><%= request.getAttribute("fname") %></td>
		</tr>

		<tr>
			<td>Email</td>
			<td><%= request.getAttribute("email") %></td>
		</tr>

        <tr>
			<td>Phone</td>
			<td><%= request.getAttribute("phone") %></td>
		</tr>
         <tr>
			<td>Gender</td>
			<td><%= request.getAttribute("gender") %></td>
		</tr>
		
		<tr>
			<td>Skills</td>
			<td><%= request.getAttribute("skills") %></td>
		</tr>
		
		
        <tr>
			<td>Country</td>
			<td>
			    <%= request.getAttribute("country") %>
			</td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td>
			   <%= request.getAttribute("address") %>
			</td>
		</tr>
	</table>
	
	
</body>
</html>