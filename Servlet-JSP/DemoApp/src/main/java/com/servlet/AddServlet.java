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

		// =======================call onother servlet inside a servlet==========
		//
		//
		//
		// 1.Request dispatcher = update the data in the same request and send it to the
		// another servlet and
		// second servlet will recieve the request and send the responce to the first
		// servlet and first servlet will send same responce to web
		//
		//
		// 2. Redirect = send the request to the first servlet and first servlet will
		// notify the browser that request is sending to the another servlet then the
		// request is send to another servlet responce recieved to the first servlet
		// and then send it top the web
		//
		// ===============================================================================

		/******************************************
		 * send data from one servlet to another session management and another value by
		 * using ref.set attribute
		 *******************************************/

//		we are setting the data to the same request and send it to the other serverlet
		request.setAttribute("result", result);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/square");
		requestDispatcher.forward(request, responce);

	}
}
