package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Login;

import com.faith.app.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@GetMapping("/user-login/{userName}&{password}")
	// @GetMapping("users/{userName}")
	public Login findUserByNameAndPassword(@PathVariable String userName, @PathVariable String password) {
	return loginService.findUserByNameAndPassword(userName, password);
	}

	// get all users
	@GetMapping("/users")
	public List<Login> getAllUsers() {
		return loginService.getAllUsers();
	}
	
	//add users
	@PostMapping("/users/add")
	public void addUser(@RequestBody Login user) {
		loginService.addUser(user);
	}
	
	//to update user
	@PutMapping("/users/update")
	public void updateUser(@RequestBody Login user) {
		loginService.updateUser(user);
	}
}
