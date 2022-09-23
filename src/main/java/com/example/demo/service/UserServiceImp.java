package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.enums.ERole;
import com.example.demo.model.User;
import com.example.demo.repository.ParticipantInformationRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ParticipantInformationRepository pInfoRepo;

	@Override
	public User createUser(User u) {
		u.setRole(ERole.PARTICIPANT);
		u = userRepository.save(u);
		return u;
	}

	@Override
	public User get(Long id) {
		Optional<User> userOp = userRepository.findById(id);
		if (userOp.isPresent())
			return userOp.get();

		return null;
	}

	@Override
	public boolean exist(User u) {
		Optional<User> user = userRepository.findFirstByEmailOrInfosSuppCin(u.getEmail(), u.getInfosSupp().getCin());
		return user.isPresent();
	}

	@Override
	public User login(String email, String password) {
		Optional<User> user = userRepository.findFirstByEmailAndPassword(email, password);
		if (user.isPresent())
			return user.get();
		
		return null;
	}

	@Override
	public User updateUser(User u) {
		return userRepository.save(u);
	}
	
	
}
