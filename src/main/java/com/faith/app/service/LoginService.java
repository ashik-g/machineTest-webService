package com.faith.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.Login;
import com.faith.app.repo.LoginRepository;
@Service
public class LoginService implements ILoginService {

	@Autowired
	private LoginRepository loginRepository;

	// to get all users
	public List<Login> getAllUsers() {
		return (List<Login>) loginRepository.findAll();
	}

	// to add user
	public void addUser(Login user) {
		loginRepository.save(user);
	}

	@Override
	public void updateUser(Login user) {
		loginRepository.save(user);

	}
	
	@Override
	public Login findUserByNameAndPassword(String userName, String password) {
	Login user = loginRepository.findByUsernameAndPassword(userName, password);
	if (userName.equals(user.getUsername()) && password.equals(user.getPassword())) {
	return user;
	} else {
	return null;
	}
	}

}
