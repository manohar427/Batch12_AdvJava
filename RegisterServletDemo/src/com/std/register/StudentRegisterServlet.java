package com.std.register;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentRegisterServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String gender = request.getParameter("gender");
		String skills[] = request.getParameterValues("skills");
		String country = request.getParameter("country");
		String address = request.getParameter("address");

		ServletOutputStream sos = response.getOutputStream();

		sos.print("<table width='700px' border='1' bgcolor=#23bc23>");

		sos.print("<tr>");
		sos.print("<td>FirstName</td>");
		sos.print("<td>" + fname + "</td>");
		sos.print("</tr>");

		sos.print("<tr>");
		sos.print("<td>Email</td>");
		sos.print("<td>" + email + "</td>");
		sos.print("</tr>");

		sos.print("<tr>");
		sos.print("<td>Phone</td>");
		sos.print("<td>" + phone + "</td>");
		sos.print("</tr>");

		sos.print("<tr>");
		sos.print("<td>Gender</td>");
		sos.print("<td>" + gender + "</td>");
		sos.print("</tr>");

		sos.print("<tr>");
		sos.print("<td>Skills</td>");
		sos.print("<td>" + Arrays.toString(skills) + "</td>");
		sos.print("</tr>");
		sos.print("<tr>");
		sos.print("<td>Country</td>");
		sos.print("<td>" + country + "</td>");
		sos.print("</tr>");

		sos.print("<tr>");
		sos.print("<td>Address</td>");
		sos.print("<td>" + address + "</td>");
		sos.print("</tr>");

		sos.print("</table>");

	}

}
