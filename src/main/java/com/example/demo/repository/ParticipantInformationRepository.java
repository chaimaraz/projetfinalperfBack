package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ParticipantInformation;


public interface ParticipantInformationRepository extends JpaRepository<ParticipantInformation, Long> {
	 
}
