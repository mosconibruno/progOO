package com.teste;

import com.meupacote.Produto;

public class Teste {

	public static void main(String[] args) {
	
		Produto p1 = new Produto(-9,-9);
		p1.comprar(120);
		p1.comprar(20);
		p1.aumentarPreco(0.5);
		p1.vender(100);
		System.out.println(p1.calcularFaturamento());
		Produto p2 = new Produto(30,25);
		p2.vender(20);
		System.out.println(p2.calcularFaturamento());
		System.out.println("Todos os Vendidos: " + Produto.getQtTotalVendas());
		
		
		/*
		Foo f = new Foo();
		f.x = 7; // Acesso de Escrita a um atr publico
		System.out.println(f.x); // Acesso de leitura a um atr publico
		
		f.setY(3); // Acesso de Escrita a um atr privado
		System.out.println(f.getY()); // Acesso de leitura a um atr privado
		
		f.setZ(1); // Acesso de Escrita a um atr default ou no modifier
		System.out.println(f.getZ()); // Acesso de leitura a um atr default ou no modifier
		*/
	}

}
