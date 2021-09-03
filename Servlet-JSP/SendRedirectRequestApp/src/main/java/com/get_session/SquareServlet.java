package com.get_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException {

		HttpSession session = request.getSession();

		int result = (int) session.getAttribute("result");

		PrintWriter out = responce.getWriter();
		out.println("square of number is " + result * result);

	}
}
