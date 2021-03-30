package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.Login;

public interface ILoginService {

	//to get all users
	public List<Login> getAllUsers();
	
	//to add users
	public void addUser(Login user);
	
	//to update user
	public void updateUser(Login user);

	public Login findUserByNameAndPassword(String userName, String password);

}