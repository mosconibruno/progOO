
public class Calculadora {
	
	public double somar(double x, double y) {
		return x+y;
	}
	
	public double dividir(double x, double y) throws ArithmeticException {
		if(y != 0) {
			return x/y;
		} else
			throw new ArithmeticException("Nao dividiras por zero!");
	}
	
}
