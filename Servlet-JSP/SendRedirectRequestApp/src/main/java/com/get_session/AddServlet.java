package com.get_session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException, ServletException {

		int number1 = 0;
		int number2 = 0;
		number1 = Integer.parseInt(request.getParameter("num1")); // Return string value so convert it into integer
		number2 = Integer.parseInt(request.getParameter("num2"));

		int result = number1 + number2;

		HttpSession session = request.getSession();
		session.setAttribute("result", result);

		responce.sendRedirect("square");
	}
}
