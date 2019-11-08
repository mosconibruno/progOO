
public class Promocao {

	private String desc;

	public Promocao(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}

	// Não sei como calcular descontos em promoção genérica, aqui eu dependo de subclasse de promoção.
	public double desconto(double valor) {
		return 1.0;
	}
	
}
