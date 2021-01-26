package edu.cientifica.appdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {
	@GetMapping("/hola")
	public String hello() {
		return "Bienvenidos al curso de Lenguaje de Programación";
	}
	
}