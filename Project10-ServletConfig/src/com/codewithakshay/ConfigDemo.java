package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigDemo extends HttpServlet {
	
	/**
	 * servletConfig
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// servletConfig Object
		ServletConfig cfg = getServletConfig();

		// PrintWriter Object
		PrintWriter out = res.getWriter();
		out.print("Hey ");

		String myName = cfg.getInitParameter("name");
		out.print(myName);

		// it will give null.. because, if the parameter not found in tag then it will
		// give null value
		/*
		 * String myAge = cfg.getInitParameter("age"); out.print(myAge);
		 */ }

}
