package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse responce) throws IOException {

		int result = 0;
		Cookie cookies[] = request.getCookies();

		for (Cookie c : cookies) {
			if (c.getName().equals("result")) {
				result = Integer.parseInt(c.getValue());
			}
		}

		PrintWriter out = responce.getWriter();
		out.println("square of number is " + result * result);

	}
}
