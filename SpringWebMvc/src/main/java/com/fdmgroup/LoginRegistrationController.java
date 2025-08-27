package com.fdmgroup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginRegistrationController {
	// @RequestMapping(value="/", method= ,) - can do mutiple methods
	@GetMapping("/")
	public String landingPage() {
		return "index";
	}

	@GetMapping("/")
	public String registerPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String postRegsiterPage(User user, HttpSession session, HttpServletRequest req,
			@RequestParam String passwordConfirm) {
		if (user.getPassword().equals(passwordConfirm)) {
			session.setAttribute("user", user);
			return "redirect:/home";
		} else {
			return "register";
		}
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}
}
