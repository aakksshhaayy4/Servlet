package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextDemo extends HttpServlet {
	
	/**
	 * servletContext
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// servletContext object
		// we can create its object in two ways..
		// 1. by using request object ref and
		// ServletContext ctx = req.getServletContext();
		// and directly also we can create
		ServletContext ctx = getServletContext();
		// both are correct
		// can choose any one..

		// here we are creating printWriter object to print the content on browser
		PrintWriter out = res.getWriter();
		out.print("Hii ");

		String name = ctx.getInitParameter("name");
		out.print(name);

	}

}
