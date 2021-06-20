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

		res.sendRedirect("square?add="+add); 
	}

}
