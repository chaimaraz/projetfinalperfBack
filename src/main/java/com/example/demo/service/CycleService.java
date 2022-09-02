package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cycle;

public interface CycleService {

	public Cycle save(Cycle cycle);
	public Cycle findById(Long id);
	public List<Cycle> findAll();
	public void delete(Long id);
}
