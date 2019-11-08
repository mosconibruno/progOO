
public class Produto {

	private String nome;
	private double preco;
	private Promocao promocao;
	
	public Produto(String nome, double preco, Promocao promocao) {
		this.nome = nome;
		this.preco = preco;
		this.promocao = promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}	
		
	public double calcularPreco() {
		// A vincula��o din�mica vai chamar o calculo do desconto de acordo com o objeto atrelado � variavel promo��o
		// do tipo Promocao. O Polimorfismo ajudou com a abertura de outras promocoes a serem atreladas a este atributo.
		return preco * promocao.desconto(preco);
	}
		
}
