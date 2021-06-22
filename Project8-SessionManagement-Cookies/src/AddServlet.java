import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int number1 = (int) req.getAttribute("num1");
		int number2 = (int) req.getAttribute("num2");

		int add = number1 + number2;

		Cookie cookies = new Cookie("add", add + ""); // cookie is class.. it accepts two parameters second one also
														// string
		
		res.addCookie(cookies);
		
		res.sendRedirect("square");

	}

}
