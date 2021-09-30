package com.gabrielCode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gabrielCode.repo.IPersonaRepo;
import com.gabrielCode.model.Persona;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	@PostMapping
	public void insertar(Persona per) {
		repo.save(per);
	}

}
