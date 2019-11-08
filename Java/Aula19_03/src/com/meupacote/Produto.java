package com.meupacote;

public class Produto {
	private int qtEstoque, qtVendido;
	private double preco;
	private static int qtTotalVendas;
	
	public Produto(int qtEstoque, double preco) {
		
		this.qtEstoque = Math.max(0,qtEstoque);
		this.preco = Math.max(1,preco);
		this.qtVendido = 0; // Didático, o Java automaticamente coloca o zero
	}
	
	public void vender(int quantidade) {
		int qtAuxiliar = Math.max(0, quantidade);
		if(qtAuxiliar <= qtEstoque) {
			qtEstoque -= qtAuxiliar;
			qtVendido += qtAuxiliar;
			qtTotalVendas += qtAuxiliar;
		}
	}
	

	public static int getQtTotalVendas() {
		return qtTotalVendas;
	}

	public double calcularFaturamento() {
		return qtVendido*preco;
	}
	
	public void aumentarPreco(double pct) {
		preco = Math.max(preco,(1+pct)*preco);
	}
	
	public void diminuirPreco(double pct) {
		preco = Math.min(preco,(1-pct)*preco);
	}
	
	public void comprar(int quantidade) {
		qtEstoque += Math.max(0,quantidade);
	}
	
}
