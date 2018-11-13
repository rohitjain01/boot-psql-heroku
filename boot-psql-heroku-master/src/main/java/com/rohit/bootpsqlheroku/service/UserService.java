package com.rohit.bootpsqlheroku.service;

import java.util.List;

import com.rohit.bootpsqlheroku.model.ApplicationUser;

public interface UserService {

	void saveUser(ApplicationUser user);

	List<ApplicationUser> getUserList();
}
