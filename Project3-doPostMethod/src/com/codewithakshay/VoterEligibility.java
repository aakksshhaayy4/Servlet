package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterEligibility extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//taking input from textbox 
		String name = req.getParameter("cname");
		
		int age = Integer.parseInt(req.getParameter("age"));
		
		PrintWriter writer = res.getWriter();
		
		if(age <=18) { 
			writer.println(name+" You are Not Eligible for Voting !");
		}
		else {
			writer.println("Congratulations "+name+" You are Eligible for Voting !");
		}
			
		
	}

}
