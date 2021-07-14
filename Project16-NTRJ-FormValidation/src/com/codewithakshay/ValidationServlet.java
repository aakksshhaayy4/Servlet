package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();

		res.setContentType("text/html");

		String name = req.getParameter("pname");
		String tage = req.getParameter("page");

		// getting client side validation status
		String vstatus = req.getParameter("vflag");

		int age = 0;
		if (vstatus.equals("no")) {
			// if client side validation is not done

			// server form validation logic
			if (name.equals("") || name == null || name.length() == 0) {
				pw.println("Person Name is Mandatory !");
				return;
			}
			if (tage.equals("") || tage == null || tage.length() == 0) {
				pw.println("Person Age is Mandatory !");
				return;
			}
			// check whether age is numeric or not
			else {
				try {
					// convert given age to numeric value
					age = Integer.parseInt(tage);
				} catch (NumberFormatException nfe) {
					pw.println("Age Must be Numeric Value !");
					return;
				}
			}
			System.out.println("Server side Validation is Completed");
		} else {
			// client side validation is done
			age = Integer.parseInt("tage");
		}

		// Write request processing logic
		if (age >= 18) {
			pw.println("<h1><font color = 'green'>" + name + "You are Eligible to Vote </font></h1>");
		} else {
			pw.println("<h1><font color = 'red'>" + name + "You are Not Eligible to Vote </font></h1>");
		}

		pw.println("<br><br><a href='FormValidation.html'>Home</a>");

	}

}
