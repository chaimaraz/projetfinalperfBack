package com.example.demo.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Formation;
import com.example.demo.repository.FormationRepository;

@Service
public class FormationServiceImp implements FormationService{

	
	@Autowired
	FormationRepository formationRepository;

	@Override
	public Formation save(Formation formation) {
		long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
		formation.setRegisteredDate(date);
		return formationRepository.save(formation);
	}

	@Override
	public Formation findById(Long id) {
		
		return formationRepository.findById(id).orElse(null);
	}

	@Override
	public List<Formation> findAll() {
		return formationRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		formationRepository.deleteById(id);
		
	}
	

	
}
