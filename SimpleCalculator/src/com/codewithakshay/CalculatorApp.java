package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorApp extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));

		// Instead of PrintWriter() using ServletOutputStream....
		ServletOutputStream sos = res.getOutputStream();


		String act = req.getParameter("act");

		if (act.equals("add")) {
			sos.println("Addition of " + x + " and " + y + " is : " + (x + y));
		} else if (act.equals("sub")) {
			sos.println("Substraction of " + x + " and " + y + " is : " + (x - y));
		} else if (act.equals("mul")) {
			sos.println("Multiplication of " + x + " and " + y + " is : " + (x * y));
		} else {
			float divide = (float) x / y;
			sos.println("Dividation of " + x + " and " + y + " is : " + divide);
		}
		
		sos.close();
	}

}
