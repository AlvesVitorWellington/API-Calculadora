package br.edu.univs.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

	public Integer somar(Integer num1, Integer num2) {
		return num1+num2;
	}
	
	public Integer multiplicar(Integer num1, Integer num2) {
		return num1*num2;
	}
	
	public Integer dividir(Integer num1, Integer num2) {
		return num1/num2;
	}
	
	public Integer subtrair(Integer num1, Integer num2) {
		return num1-num2;
	}
	
	
}
