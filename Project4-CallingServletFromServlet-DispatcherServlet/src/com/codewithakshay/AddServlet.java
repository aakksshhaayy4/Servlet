package com.codewithakshay;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int first = Integer.parseInt(req.getParameter("num1"));
		int second = Integer.parseInt(req.getParameter("num2"));

		int add = first + second;

		// here we are passing data to another servlet in (Key:Value) format.. at line
		// no : 26... we have used ====rd.forward(req, res);==== It is carrying same
		// objects, which having in other servler class (SquareServlet)
		// It is like a session management concept....
		req.setAttribute("add", add);

		RequestDispatcher rd = req.getRequestDispatcher("square"); // Here we are passing url of the servlet, which we
																	// want to call..
		rd.forward(req, res);

	}

}
