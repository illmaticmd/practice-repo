package com.fdmgroup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
	}

	private UserValidation uv = new UserValidation();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		HttpSession session = req.getSession();
		User user = new User();

		user.setUsername(username);
		user.setPassword(password);

		if (uv.validateUser(user) == false) {
			session.setAttribute("user", user);
			req.getRequestDispatcher("WEB-INF/views/userProfile.jsp").forward(req, resp); // how to send on to another
																							// page
		} else {
			req.getRequestDispatcher("WEB-INF/views/register.jsp").forward(req, resp);
		}
	}
}
