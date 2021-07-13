package com.codewithakshay;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryStateServlet extends HttpServlet {
	
	/*
	 * This is program is to get state names based on the selection of countries..
	 * 
	 *Actually, in this program we've implemented the 
	 *Communication between servlet to html by using java Script...
	 *
	 *onSubmit, onDbClick, onChange etc..
	 *
	 *So, in this program we've used onChange event in html
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// PrintWriter object
		PrintWriter pw = res.getWriter();

		// set content type
		res.setContentType("text/html");

		String country = req.getParameter("country");

		String indiaStates[] = { "Maharashtra", "Andhra Pradesh", "Tamil Nadu", "Kerala", "Bihar", "Odisa" };
		String usStates[] = { "Alabama", "California", "Florida", "Hawaii", "Indiana" };
		String ukStates[] = { "England", "Scotland", "Wales", "Northern Ireland" };
		String shriLankaStates[] = { "North  Eastern", "Anuradhapura", "Southern", "Kandy", "Western" };
		String austreliaStates[] = { "Northern Territory", "Queensland", "South Australia", "Western Australia",
				"Victoria" };

		// get states based on the country selection
		if (country.equals("India")) {
			pw.println("<h2 style= 'color: red; font-family: monospace; text-align : center;'> States of India : "
					+ Arrays.toString(indiaStates) + " <h2>");
		} else if (country.equals("United States")) {
			pw.println(
					"<h2 style= 'color: red; font-family: monospace; text-align : center;'>States in United States : "
							+ Arrays.toString(usStates) + " <h2>");
		} else if (country.equals("United Kingdom")) {
			pw.println(
					"<h2 style= 'color: red; font-family: monospace; text-align : center;'>States in United Kingdom : "
							+ Arrays.toString(ukStates) + " <h2>");
		} else if (country.equals("ShriLanka")) {
			pw.println("<h2 style= 'color: red; font-family: monospace; text-align : center;'>States in ShriLanka : "
					+ Arrays.toString(shriLankaStates) + " <h2>");
		} else if (country.equals("Austrelia")) {
			pw.println("<h2 style= 'color: red; font-family: monospace; text-align : center;'>States in Austrelia : "
					+ Arrays.toString(austreliaStates) + " <h2>");
		}
		pw.println("<a style = 'align : center; font-family: monospace;' href = 'Country-State.html'>Home</a>");
	}

}
