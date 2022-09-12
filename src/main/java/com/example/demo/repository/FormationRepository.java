package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Cycle;
import com.example.demo.model.Formation;
import com.example.demo.model.User;

public interface FormationRepository extends JpaRepository<Formation, Long>{
	Optional<Formation> findFirstByCycleAndUser(Cycle cycle, User user);

}
