package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Formateur;

public interface FormateurService {
	Formateur saveFormateur(Formateur f);
	Formateur updateFormateur(Formateur f);
	void deleteFormateur(Formateur f);
	void deleteFormateurById(int id);
	Formateur getFormateur(int id);
	List<Formateur> getAllFormateurs();
}
