package edu.cientifica.appdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Web services rest*/ 
@Controller /*pLantilla html web*/
public class DemoController {
	
	@GetMapping("/saludo")
	public String DemoSaludo(
			@RequestParam (value = "nombre", defaultValue = "Cientifica") String nombre) {
		
		return "Bienvenidos al curso :" + nombre; 
	}
	
	@GetMapping ("/evaluar")
	public String Evaluar(
			@RequestParam (value = "numero", defaultValue = "0") int numero) {
		
		String mensaje ="";
		if (numero%2 == 0) {
			mensaje = numero+": Es un numero par";
		}else {
			mensaje = numero+": Es un numero impar";
		}
			
		return mensaje; 
	}
}
