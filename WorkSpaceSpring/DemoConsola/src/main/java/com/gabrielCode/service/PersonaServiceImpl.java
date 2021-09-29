package com.gabrielCode.service;

import com.gabrielCode.repository.IPersona;

public class PersonaServiceImpl implements IpersonaService{
	IPersona repo;
	@Override
		public void registrarHandler(String pNombre) {
			repo.registrar(pNombre);
	}
}
