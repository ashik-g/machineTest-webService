package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.faith.app.entity.Request;
import com.faith.app.repo.RequestRepository;

public class RequestService implements IRequestService {

	@Autowired
	private RequestRepository requestRepository;
	
	//to get all the requests
	public List<Request> getAllRequest(){
		return (List<Request>) requestRepository.findAll();
	}
	
	//to add the new request
	public void addRequest(Request request) {
		requestRepository.save(request);
	}
	
	//to update the request
	public void updateRequest(Request request) {
		requestRepository.save(request);
	}
}
