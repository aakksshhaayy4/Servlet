package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextDemo2 extends HttpServlet {

	/**
	 * servletContext
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		ServletContext ctx = req.getServletContext();

		PrintWriter out = res.getWriter();
		out.print("Hii ");

		String myName = ctx.getInitParameter("name");
		out.print(myName);

		String myAge = ctx.getInitParameter("age");
		out.print(" your age is : " + myAge);

	}

}
