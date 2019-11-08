
public class FinalDeSemana extends Promocao {

	public FinalDeSemana(String desc) {
		super(desc);
	}

	@Override
	public double desconto(double valor) {
		if (valor > 100)
			return 0.95;
		else
			return 1;
	}

}
