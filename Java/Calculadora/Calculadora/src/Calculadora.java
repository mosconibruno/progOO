
public class Calculadora {
	
	double n1, n2;
	
	Calculadora(double n1, double n2){
	this.n1 = n1;
	this.n2 = n2;		
	}
	
	public void somar () {
		double res = n1+n2;
		System.out.println(res);
	}
	
	public void subtrair () {
		System.out.println(n1-n2);
	}
	
	public void multiplicar () {
		System.out.println(n1*n2);
	}
	public void dividir () {
		if (n2 == 0)
			System.out.println("ERRO...");
		else
		System.out.println(n1/n2);
	}
}
