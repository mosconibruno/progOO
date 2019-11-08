import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	
	Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
	}

	public void telaCalc() {
		int opt = 7;
		while(opt != 0) {
			System.out.println("Digite uma opção: ");
			try {
				opt = Integer.parseInt(JOptionPane.showInputDialog("Digite um opcao: "));
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			switch(opt) {
			case 0: {
				System.out.println("Adeus");
				break;
			}
			case 1: { 
				telaSomar();
				break; 
				}
			case 2: {
				telaDividir();
				break;
				}
			default: {
				System.out.println("Opção inválida");
				break;
			}
				
			}
		}
		sc.close();
	}
	
	public void telaSomar() {
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro numero: "));
		Calculadora c = new Calculadora();
		System.out.println("A soma é: " + c.somar(x, y));
	}
	
	public void telaDividir() {
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro numero: "));
		Calculadora c = new Calculadora();
		try {
			System.out.println("A divisão é: " + c.dividir(x, y));
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
