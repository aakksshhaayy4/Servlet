package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));

		int sum = number1 + number2;
		
		PrintWriter out = res.getWriter();
		
		out.println("Addition is : "+sum);

	}

}
