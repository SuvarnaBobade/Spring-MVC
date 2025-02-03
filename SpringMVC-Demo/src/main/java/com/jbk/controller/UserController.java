package com.jbk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jbk.entity.User;

@Controller
public class UserController {
	@ModelAttribute
	public User setUpUserForm() {
		return new User();

	}

	@GetMapping("/")
	public String home() {
		return "home";

	}

	@GetMapping("/userform")
	public String userForm(Model model) {
		return "userform";
	}

	@PostMapping("/submitform")
	public String submitform(@ModelAttribute User user, Model model) {
		model.addAttribute("message", "U R response Submitted Succcessfully.... ");
		model.addAttribute("user", user);
		return "home";

	}
}
