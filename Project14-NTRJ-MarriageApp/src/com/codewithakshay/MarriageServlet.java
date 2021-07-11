package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	/*
	 * In this web application, we have implemented Marriage Eligibility
	 * functionality for male, female and other type of genders..
	 * 
	 * so in this application, user has to ender his/her name, age and has to select
	 * perticular gender
	 * 
	 * based on the gender and the age, user will be test their eligibility for
	 * marriage..
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// printWriter object
		PrintWriter pw = res.getWriter();

		// set content type
		res.setContentType("text/html");

		// getting inputs as a parameter from end user
		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));
		String gender = req.getParameter("gender");

		// conditions
		if (gender.equals("f")) {
			if (age < 18) {
				pw.println("<h2 style='text-align : center; color : red; padding-top : 100px;' >Sorry "+name +", You are not eligible for Marriage !<h2>");
			} else {
				pw.println("<h2 style='text-align : center; color : green; padding-top : 100px;' >Congratulations "+name +", You are eligible for Marriage !<h2>");
			}
		} else if (gender.equals("m")) {
			if (age < 21) {
				pw.println("<h2 style='text-align : center; color : red; padding-top : 100px;' >Sorry "+name +", You are not eligible for Marriage !<h2>");
			} else {
				pw.println("<h2 style='text-align : center; color : green; padding-top : 100px;' >Congratulations "+name +", You are eligible for Marriage !<h2>");
			}
		} else if (gender.equals("o")) {
			if (age < 21) {
				pw.println("<h2 style='text-align : center; color : red; padding-top : 100px;' >Sorry "+name +", You are not eligible for Marriage !<h2>");
			} else {
				pw.println("<h2 style='text-align : center; color : green; padding-top : 100px;' >Congratulations "+name +", You are eligible for Marriage !<h2>");
			}
		}
		pw.println("<a style = 'align : center;' href = 'marriage.html'>Home</a>");
	}

}
