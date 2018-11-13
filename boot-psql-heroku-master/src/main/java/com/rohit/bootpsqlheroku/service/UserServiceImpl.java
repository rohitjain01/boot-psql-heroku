package com.rohit.bootpsqlheroku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.bootpsqlheroku.model.ApplicationUser;
import com.rohit.bootpsqlheroku.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public void saveUser(ApplicationUser user) {
		userRepository.save(user);
	}

	@Override
	public List<ApplicationUser> getUserList() {
		return userRepository.findAllByOrderByFullName();
	}
}
