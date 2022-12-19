package com.RestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.dao.dao;
import com.RestApi.model.model;

@RestController
@RequestMapping("controller")
public class controller {

	@Autowired  
	private dao apivalue;
 
	@PostMapping("/add")  
	public model postModel(@RequestBody model value) {
		return apivalue.postModel(value);
	} 
	
	@GetMapping("/getall")
	public List<model>getModel(){
		return apivalue.getModel();
	}
	
	@GetMapping("/get")
	public model getbyid(int id) {
		return apivalue.getbyidModel(id);
	}
}
