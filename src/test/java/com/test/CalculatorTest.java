package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSomar() {
		Calculator calc = new Calculator();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}

}
