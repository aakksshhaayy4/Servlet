package com.codewithakshay;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	/**
	 * AddServlet
	 * Cookie
	 * addCookie()
	 * sendRedirect();
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int number1 = Integer.parseInt(req.getParameter("num1"));
		int number2 = Integer.parseInt(req.getParameter("num2"));

		int add = number1 + number2;

		Cookie cookies = new Cookie("add", add + ""); // cookie is class.. it accepts two parameters second one also
														// string

		res.addCookie(cookies);

		res.sendRedirect("square");

	}

}
