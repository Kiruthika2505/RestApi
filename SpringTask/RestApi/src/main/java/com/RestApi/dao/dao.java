package com.RestApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestApi.model.model;
import com.RestApi.service.service;

@Service
public class dao {

	@Autowired
	service servicename;
	public model postModel(model value) {
		
		return servicename.save(value);
	}
 
	public List <model> getModel() {
		
		return servicename.findAll();
	}
 
	public model getbyidModel(int id) {
		
		return servicename.findById(id).orElse(null);
	}
}
