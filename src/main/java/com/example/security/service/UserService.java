package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.dto.UserDto;
import com.example.security.entity.User;
import com.example.security.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserRepository userRepository;

	public User findByUsername(String username) {

		return userRepository.findByUsername(username);
	}

	public User save(UserDto userDto) {
		User user = new User(userDto.getUsername(), passwordEncoder.encode(userDto.getPassword()), userDto.getFullname());
		return userRepository.save(user);
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

}