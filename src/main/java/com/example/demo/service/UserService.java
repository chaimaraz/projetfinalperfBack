package com.example.demo.service;

import com.example.demo.model.Formateur;
import com.example.demo.model.User;

public interface UserService {
	User createUser(User u);
	User get(Long id);
	boolean exist(User u);
	User login(String email, String password);
	User updateUser(User u);
}
