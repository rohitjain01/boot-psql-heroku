package com.rohit.bootpsqlheroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rohit.bootpsqlheroku.model.ApplicationUser;
import com.rohit.bootpsqlheroku.service.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@RequestMapping("/")
	String index(Model model) {
		return "index";
	}

	@RequestMapping(value="/createUser")
	public String createUser(Model model) {
		model.addAttribute("user", new ApplicationUser());
		return "createUserForm";
	}

	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String saveUser(@ModelAttribute ApplicationUser user, Model model) {
		userService.saveUser(user);
		return "index";
	}

	@RequestMapping(value="users")
	public String getUsers(Model model) {
		model.addAttribute("userList", userService.getUserList());
		return "users";
	}
}
