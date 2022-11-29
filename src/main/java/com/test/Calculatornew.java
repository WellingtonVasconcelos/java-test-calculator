package com.test;

public class Calculatornew {

	public int somar(int ...valores) {
		int soma = 0;
		for (int valor : valores) {
			soma += valor;
		}
		return soma;
	}
	
}
