package com.gabrielCode.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gabrielCode.repository.PersonaRepoImpl1;
import com.gabrielCode.repository.IPersona;

@Service

public class PersonaServiceImpl implements IpersonaService{
	@Autowired
	@Qualifier("persona1")
	IPersona repo;
	@Override
	public void registrarHandler(String pNombre) {
		repo.registrar(pNombre);
	}
	

}
