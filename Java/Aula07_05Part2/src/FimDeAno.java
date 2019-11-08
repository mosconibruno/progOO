
public class FimDeAno extends Promocao {

	public FimDeAno(String desc) {
		super(desc);
	}

	@Override
	public double desconto(double valor) {
		if (valor > 20)
			return 0.75;
		else
			return 1;
	}

}
