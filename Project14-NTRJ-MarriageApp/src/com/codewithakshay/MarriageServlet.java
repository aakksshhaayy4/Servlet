package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

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

		/*
		 * if(age<18 && gender.equals("f")) {
		 * pw.println("You are not Eligible for Marriage !"); } else {
		 * pw.println("You are Eligible for Marriage !"); } if(age<21 &&
		 * gender.equals("m")) { pw.println("You are not Eligible for Marriage !"); }
		 * else { pw.println("You are Eligible for Marriage !"); } if(age<21 &&
		 * gender.equals("o")) { pw.println("You are not Eligible for Marriage !"); }
		 * else { pw.println("You are Eligible for Marriage !"); }
		 */

		if (gender.equals("f")) {
			if (age < 18) {
				pw.println("You are not eligible");
			} else {
				pw.println("You are eligible");
			}
		} else if (gender.equals("m")) {
			if (age < 21) {
				pw.println("You are not eligible");
			} else {
				pw.println("You are eligible");
			}
		} else if (gender.equals("o")) {
			if (age < 21) {
				pw.println("You are not eligible");
			} else {
				pw.println("You are eligible");
			}
		}
	}

}
