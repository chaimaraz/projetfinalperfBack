package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody User u) {
		try {
			if(userService.exist(u)) {
				return ResponseEntity.badRequest().body("NAME_TAKEN");
			} else {
				return ResponseEntity.ok(userService.createUser(u));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> ajouterUser(@RequestBody User u) {
		User user=userService.createUser(u);
    	return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> get(@PathVariable Long id) {
		try {
			return ResponseEntity.ok(userService.get(id));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> get(@RequestParam String email, @RequestParam String password) {
		try {
			User user = userService.login(email, password);
			if(user == null) {
				return ResponseEntity.badRequest().body("WRONG_CRED");
			} 
			
			return ResponseEntity.ok(user);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	
	
}
