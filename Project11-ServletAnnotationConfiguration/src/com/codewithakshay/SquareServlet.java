package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	
	/**
	 * SquareServlet
	 * getCookies()
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int value = 0;

		Cookie[] cookies = req.getCookies();

		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("add")) {
				value = Integer.parseInt(cookie.getValue());
			}
		}

		value = value * value;

		PrintWriter writer = res.getWriter();

		writer.println("Square is : " + value);

	}

}
