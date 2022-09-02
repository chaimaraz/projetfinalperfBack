package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Formateur;
import com.example.demo.service.FormateurService;

@RestController
@RequestMapping(value = "/formateur")
public class FormateurController {
   
	@Autowired
    FormateurService formateurService;
	
	 @GetMapping("/all")
	 public ResponseEntity<List<Formateur>> getAllFormateurs(){
		 List<Formateur> formateurs=formateurService.getAllFormateurs();
		 return new ResponseEntity<>(formateurs, HttpStatus.OK);
	    }
	 
	 @GetMapping("/find/{id}")
	 public ResponseEntity<Formateur> getFormateurById(@PathVariable("id")int id){
		 Formateur formateur=formateurService.getFormateur(id);
		 return new ResponseEntity<>(formateur, HttpStatus.OK);
	    }

	    @PostMapping(value="/add")
	    public ResponseEntity<Formateur> addFormateur(@RequestBody Formateur formateur){
	    	Formateur f=formateurService.saveFormateur(formateur);
	    	return new ResponseEntity<>(f, HttpStatus.CREATED);
	    }

	    @PutMapping("/update")
	    public ResponseEntity<Formateur> updateFormateur(@RequestBody Formateur formateur){
	    	Formateur upformateur=formateurService.updateFormateur(formateur);
	    	return new ResponseEntity<>(upformateur, HttpStatus.OK);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Formateur> deleteFormateur(@PathVariable("id") int id){
	    	formateurService.deleteFormateurById(id);
	    	return new ResponseEntity<>( HttpStatus.OK);
	    }


    
    
}
