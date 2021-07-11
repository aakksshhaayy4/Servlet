package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));

		if (age < 18) {
			pw.println("<b><h4 style='color : red' >" + name + ", You're not Eligible for Voting <h4><b>");
		} else {
			pw.println(
					"<b><h4 style='color : green' >" + name + ", Congratulation ! You're Eligible for Voting <h4><b>");
		}

		pw.println("<a href = 'vote.html'>home<a>");

	}

}
