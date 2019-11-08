
public class IMC {
	double imc, peso, altura;
	
	void calcularIMC() {
		imc = peso/(altura*altura);
		
		if(imc < 18)
			System.out.println("Você está Magro, seu IMC é: " + imc);
		else
			if(imc <= 25)
				System.out.println("Você está saudável, seu IMC é: " + imc);
			else
				System.out.println("Você está com Sobrepeso, seu IMC é: " + imc);
		}
}
