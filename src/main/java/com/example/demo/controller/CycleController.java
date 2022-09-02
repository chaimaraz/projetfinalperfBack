package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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

import com.example.demo.model.Cycle;
import com.example.demo.model.Formateur;
import com.example.demo.service.CycleService;
import com.example.demo.service.FormateurService;

@RestController
@RequestMapping(value = "/cycles")
public class CycleController {

	@Autowired
	CycleService cycleService;
	
	@Autowired
	FormateurService formateurService;
	
	@GetMapping("/formateurs")
	 public ResponseEntity<List<Formateur>> listerFprmateurs(){
		 List<Formateur> f=formateurService.getAllFormateurs();
		 return new ResponseEntity<>(f, HttpStatus.OK);
	    }
	
	@GetMapping("/all")
	 public ResponseEntity<List<Cycle>> getAllCycle(){
		 List<Cycle> cycles=cycleService.findAll();
		 return new ResponseEntity<>(cycles, HttpStatus.OK);
	    }
	
	@GetMapping("{id}")
	 public ResponseEntity<Cycle> getCycle(@PathVariable("id") Long id){
		 Cycle cycle=cycleService.findById(id);
		 return new ResponseEntity<>(cycle, HttpStatus.OK);
	    }
	


	    @PostMapping(value="/add")
	    public ResponseEntity<Cycle> addCycle(@RequestBody Cycle cycle){
	    	Cycle c=cycleService.save(cycle);
	    	return new ResponseEntity<>(c, HttpStatus.CREATED);
	    }
	    
	    @PutMapping("/update/{id}")
	    public ResponseEntity<Cycle> updateFormateur(@PathVariable("id") Long id,@RequestBody Cycle cycle){
	    	Cycle upCycle=cycleService.findById(id);
	    	
	    	if(upCycle == null) {
	    		return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    	}
	    	try {
	    		upCycle.setDateDebut(cycle.getDateDebut());
	    		upCycle.setDateFin(cycle.getDateFin());
	    		upCycle.setDuree(cycle.getDuree());
	    		upCycle.setEntrprise(cycle.getEntrprise());
	    		upCycle.setFormateur(cycle.getFormateur());
	    		upCycle.setGouvernorat(cycle.getGouvernorat());
	    		upCycle.setHeureDebut(cycle.getHeureDebut());
	    		upCycle.setLieu(cycle.getLieu());
	    		upCycle.setMode(cycle.getMode());
	    		upCycle.setChoix(cycle.getChoix());
	    		upCycle.setNumAction(cycle.getNumAction());
	    		upCycle.setNumSalle(cycle.getNumSalle());
	    		upCycle.setTheme(cycle.getTheme());
	    		upCycle.setPause(cycle.getPause());
	    		return new ResponseEntity<>(cycleService.save(upCycle),HttpStatus.CREATED);
	    		
	    		
	    	}
	    	catch(DataAccessException e) {
	    		return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
	    	}
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<Formateur> deleteFormateur(@PathVariable("id") Long id){
	    	cycleService.delete(id);
	    	return new ResponseEntity<>( HttpStatus.OK);
	    }
}
