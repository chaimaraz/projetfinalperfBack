package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Formation;


public interface FormationService {
	public Formation save(Formation formation);
	public Formation findById(Long id);
	public List<Formation> findAll();
	boolean exist(Formation u);
	public void delete(Long id);

}
