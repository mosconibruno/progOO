
public class Promocao {

	private String desc;

	public Promocao(String desc) {
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}

	// N�o sei como calcular descontos em promo��o gen�rica, aqui eu dependo de subclasse de promo��o.
	public double desconto(double valor) {
		return 1.0;
	}
	
}
