package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApp extends HttpServlet {

	/*
	 * In this web application, we are going to see the communication between Html
	 * to Servlet
	 * 
	 * so, there are three approaches to achieve communication
	 * 
	 * 1) using hyperlink 2) using submit button 3) using java script..
	 * 
	 * so, in this project, we've implemented first approach i.e. using submit button
	 */

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// set content type
		res.setContentType("text/html");

		// printwriter object
		PrintWriter pw = res.getWriter();

		// getting parameters from end user
		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));

		// checking the eligibility
		if (age < 18) {
			pw.println("<b><h4 style='color : red' >" + name + ", You're not Eligible for Voting <h4><b>");
		} else {
			pw.println(
					"<b><h4 style='color : green' >" + name + ", Congratulation ! You're Eligible for Voting <h4><b>");
		}

		pw.println("<a href = 'vote.html'>home<a>");

	}

}
