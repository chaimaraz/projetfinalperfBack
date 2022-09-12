package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cycle;


public interface CycleRepository extends JpaRepository<Cycle, Long> {
	

}
