package com.fdmgroup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double random = Math.random();
		
		req.setAttribute("randomNumber", random);
		
		req.getRequestDispatcher("WEB-INF/views/RandomNumber.jsp").forward(req, resp);
		
		
		
		//		PrintWriter out = resp.getWriter();
//		
//		out.println("<html>");
//		out.println("<head><title>A random number! You're welcome!</title></head>");
//		out.println("<body><p>" + Math.random() + "</p></body>");
//		out.println("</html>");

		
		//super.doGet(req, resp);
	}
	
}
