package com.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSomar() {
		Calculator calc = new Calculator();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	@Test
	public void testSomarWithMock() {
		Calculator calculator = mock (Calculator.class);
		
		when(calculator.somar("1+2")).thenReturn(10);
		
		int resultado = calculator.somar("1+2");
		
		assertEquals(10, resultado);
	}

}
