
public class IMC {
	double imc, peso, altura;
	
	void calcularIMC() {
		imc = peso/(altura*altura);
		
		if(imc < 18)
			System.out.println("Voc� est� Magro, seu IMC �: " + imc);
		else
			if(imc <= 25)
				System.out.println("Voc� est� saud�vel, seu IMC �: " + imc);
			else
				System.out.println("Voc� est� com Sobrepeso, seu IMC �: " + imc);
		}
}
