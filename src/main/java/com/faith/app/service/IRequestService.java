package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Request;

public interface IRequestService {

	//to get all the request
	public List<Request> getAllRequest();
	
	//to add new request
	public void addRequest(Request request);
	
	//to update the request
	public void updateRequest(Request request);
}