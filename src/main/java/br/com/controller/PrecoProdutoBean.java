package br.com.controller;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.service.CalculadoraPreco;

@Named("meuBean")
public class PrecoProdutoBean {

		 @Inject
		 private CalculadoraPreco calculadora;
		
		 public double getPreco() {
		 return calculadora.calcularPreco(12, 44.55);

	}
}
