package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Formateur;
import com.example.demo.repository.FormateurRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private  FormateurRepository formateurRepository;
	@Test
	public void testCreateFormateur() {
	Formateur formateur = new Formateur("xx","xxx","1254","asde","4566");
	formateurRepository.save(formateur);
	}
	@Test
	public void testFindProduit()
	{
	Formateur p = formateurRepository.findById(1).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Formateur p = formateurRepository.findById(1).get();
	p.setAdresse("dh");
	formateurRepository.save(p);
	}
	@Test
	public void testDeleteProduit(){
		formateurRepository.deleteById(1);;
	}


}
