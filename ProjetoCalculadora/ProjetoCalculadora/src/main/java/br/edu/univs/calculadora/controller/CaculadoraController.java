package br.edu.univs.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.univs.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("api/v1/calculadora")
public class CaculadoraController {
	
	@Autowired
	private CalculadoraService service;
	
	@GetMapping(value ="/somar")
	public Integer somar(@RequestParam Integer num1,
			@RequestParam Integer num2) {
		return service.somar(num1, num2);
		
	}
	
	@GetMapping(value ="/multiplicar")
	public Integer multiplicar(@RequestParam Integer num1,
			@RequestParam Integer num2) {
		return service.multiplicar(num1, num2);
	}
	
	@GetMapping(value ="/dividir")
	public Integer dividir(@RequestParam Integer num1,
			@RequestParam Integer num2) {
		return service.dividir(num1, num2);
	}
	
	@GetMapping(value ="/subtrair")
	public Integer subtrair(@RequestParam Integer num1,
			@RequestParam Integer num2) {
		return service.subtrair(num1, num2);
	}


}
