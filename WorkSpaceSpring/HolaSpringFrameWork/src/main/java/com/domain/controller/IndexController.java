package com.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/home")
	public String goIndex() {
	return "index";
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		return "Presentacion";	}
	
	@RequestMapping("/listado")
	public String goListado(Model model) {
		
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Juan");
		alumnos.add("Pedro");
		alumnos.add("J?se");
		
		model.addAttribute("titulo","Listado de alumnnos");
		model.addAttribute("profesor","Gabriel Casas");
		model.addAttribute("alumnos",alumnos);
		
		return "Listado";
	}
}
