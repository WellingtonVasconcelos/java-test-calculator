package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorNewTest {
	
	@Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2;
		
		Calculatornew calc = new Calculatornew();
		int soma = calc.somar(valorA, valorB);
		
		assertEquals(3, soma); 
	}
	
	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		Calculatornew calc = new Calculatornew();
		int soma = calc.somar(valorA, valorB, valorC);
		
		assertEquals(6, soma); 
	}

}
