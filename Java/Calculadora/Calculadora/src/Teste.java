import java.util.Scanner;

public class Teste {
	
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			System.out.println("Digite um número: ");
			double x = s.nextDouble();
			System.out.println("Digite outro Numero: ");
			double y = s.nextDouble(); 
			s.close();
			
			
			/*
			Calculadora c = new Calculadora(14, 15);
			Calculadora d = new Calculadora(1, 2);
			c.somar();
			d.somar();
		     */
			
			Calculadora_2 k = new Calculadora_2();
			System.out.println(k.somar(14, 10));
			
			Calculadora_2 m = new Calculadora_2();
			System.out.println(m.somar(x, y));
			

		}
	}