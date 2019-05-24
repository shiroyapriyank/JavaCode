package com.priyank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.priyank.entities.User;
import com.priyank.repositories.UserRespository;

@Controller
public class UserController {

	private final UserRespository userRespository;

	@Autowired
	public UserController(UserRespository userRespository) {
		this.userRespository = userRespository;
	}

	@GetMapping("/signup")
	public String showSignupForm(User user) {
		return "add-user";
	}

	@PostMapping("/adduser")
	public String aaddUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		userRespository.save(user);
		model.addAttribute("users", userRespository.findAll());
		return "index";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id") long id, Model model) {
		User user = userRespository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid User id: " + id));
		model.addAttribute("user", user);
		return "update-user";
	}

	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") long id, @Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			user.setId(id);
			return "update-user";
		}
		userRespository.save(user);
		model.addAttribute("users", userRespository.findAll());
		return "index";
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		User user = userRespository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid User id: " + id));
		userRespository.delete(user);
		model.addAttribute("users", userRespository.findAll());
		return "index";
	}

}
