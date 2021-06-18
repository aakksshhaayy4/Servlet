package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//taking input from textbox 
		String name = req.getParameter("cname");
		
		PrintWriter writer = res.getWriter();
		
		writer.println("Hello "+name+" Have a nice Day !");
		
	}

}
