package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse responce) throws IOException {

		int result = (int) request.getAttribute("result");
		PrintWriter out = responce.getWriter();
		out.println("square of number is " + result * result);
	}
}
