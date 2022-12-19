package com.RestApi.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestApi.model.model; 

public interface service extends JpaRepository<model, Integer>{

}
