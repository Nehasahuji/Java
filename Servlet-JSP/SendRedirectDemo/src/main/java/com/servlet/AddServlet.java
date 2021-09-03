package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse responce) throws IOException, ServletException {

		int number1 = 0;
		int number2 = 0;
		number1 = Integer.parseInt(request.getParameter("num1")); // Return string value so convert it into integer
		number2 = Integer.parseInt(request.getParameter("num2"));

		int result = number1 + number2;

		/*
		 * System.out.println("addition of two number is " + result);
		 * 
		 * PrintWriter out = responce.getWriter(); out.println("result is " + result);
		 */

//		send data from one servlet to another
//	    session management and another value
//      by using ref.set attribute
//		
		request.setAttribute("result", result);

//		=======================call onother servlet inside a servlet
		// 1.Request dispatcher
		// 2. Redirect
		// ========================

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/square");
		requestDispatcher.forward(request, responce);

	}
}
