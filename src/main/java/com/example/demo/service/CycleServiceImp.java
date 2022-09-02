package com.example.demo.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cycle;
import com.example.demo.repository.CycleRepository;

@Service
public class CycleServiceImp implements CycleService {

	@Autowired
	CycleRepository cycleRepository;
	
	@Override
	public Cycle save(Cycle cycle) {
		return cycleRepository.save(cycle);
	}

	@Override
	public Cycle findById(Long id) {
		return cycleRepository.findById(id).orElse(null);
	}

	@Override
	public List<Cycle> findAll() {
		return cycleRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		cycleRepository.deleteById(id);
		
	}

}
