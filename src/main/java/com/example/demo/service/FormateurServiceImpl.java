package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Formateur;
import com.example.demo.repository.FormateurRepository;

@Service
public class FormateurServiceImpl implements FormateurService{

	@Autowired
	FormateurRepository formateurRepository;
	
	@Override
	public Formateur saveFormateur(Formateur f) {
		return formateurRepository.save(f);
	}

	@Override
	public Formateur updateFormateur(Formateur f) {
		return formateurRepository.save(f);
	}

	@Override
	public void deleteFormateur(Formateur f) {
		formateurRepository.delete(f);	
	}

	@Override
	public void deleteFormateurById(int id) {
		formateurRepository.deleteById(id);
		
	}

	@Override
	public Formateur getFormateur(int id) {
		return formateurRepository.findById(id).get();
	}

	@Override
	public List<Formateur> getAllFormateurs() {
		return formateurRepository.findAll();
	}

}
