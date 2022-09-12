package com.example.demo.service;


import java.util.List;
import java.util.Optional;

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

	@Override
	public boolean exist(Formation f) {
		Optional<Formation> formation = formationRepository.findFirstByCycleAndUser(f.getCycle(), f.getUser());
		return formation.isPresent();
	}
	
	
	

	
}
