
public class Feriado extends Promocao {

	public Feriado(String desc) {
		super(desc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double desconto(double valor) {
		if (valor > 50)
			return 0.9;
		else
			return 1;
	}

	
}
