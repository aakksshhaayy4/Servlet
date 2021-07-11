package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GnrtWshMsg extends HttpServlet {

	/*
	 * In this web application, we are going to see the communication between Html
	 * to Servlet
	 * 
	 * so, there are three approaches to achieve communication
	 * 
	 * 1) using hyperlink 2) using submit button 3) using java script..
	 * 
	 * so, in this project, we've implemented first approach i.e. using hyperlink
	 */

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// printwriter object
		PrintWriter pw = res.getWriter();

		int hour = 0;

		Calendar calender = Calendar.getInstance();

		// getting currrent hour of the day
		hour = calender.get(Calendar.HOUR_OF_DAY);

		// generating greet message based on the current time..
		if (hour <= 12) {
			pw.println("Good Morning");
		} else if (hour <= 16) {
			pw.println("Good Afternoon");
		} else if (hour <= 20) {
			pw.println("Good Evening");
		} else {
			pw.println("Good Night");
		}

	}

}
