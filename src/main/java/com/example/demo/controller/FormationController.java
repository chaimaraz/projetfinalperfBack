package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Formation;
import com.example.demo.service.FormationService;

@RestController
@RequestMapping(value = "/formation")
public class FormationController {
	
	@Autowired
	FormationService formationService;
	
	@GetMapping("/all")
	 public ResponseEntity<List<Formation>> getAllFormations(){
		 List<Formation> formations=formationService.findAll();
		 return new ResponseEntity<>(formations, HttpStatus.OK);
	    }
	 
	 @GetMapping("/find/{id}")
	 public ResponseEntity<Formation> getFormationById(@PathVariable("id") Long id){
		 Formation formation=formationService.findById(id);
		 return new ResponseEntity<>(formation, HttpStatus.OK);
	    }

	 @PostMapping(value="/add")
	 public ResponseEntity<?> addFormation(@RequestBody Formation formation){
		 try {
				if(formationService.exist(formation)) {
					return ResponseEntity.badRequest().body("formation exist");
				} else {
					return ResponseEntity.ok(formationService.save(formation));
				}
			} catch (Exception e) {
				e.printStackTrace();
				return ResponseEntity.badRequest().body(e.getMessage());
			}	
		 
		 
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Formation> deleteFormation(@PathVariable("id") Long id){
	    	formationService.delete(id);
	    	return new ResponseEntity<>( HttpStatus.OK);
	    }
}
