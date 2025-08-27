package com.fdmgroup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/register.jsp").forward(req, resp);
	}

	private UserRegister ur = new UserRegister();
	private UserValidation uv = new UserValidation();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");

		HttpSession session = req.getSession();
		User user = new User();

		user.setUsername(username);
		user.setPassword(password);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		
		if (uv.validateUser(user) == true) {
			ur.registerUser(user);
			session.setAttribute("user", user);
			req.getRequestDispatcher("WEB-INF/views/userProfile.jsp").forward(req, resp); // how to send on to another
																							// page
		} else {
			req.getRequestDispatcher("").forward(req, resp);
		}

	}
}
