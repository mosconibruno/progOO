
public class Revolver {
	
	int municao, municaoMaxima;
	
	void atirar() {
		if(municao>0) {
			System.out.println("BANG!");
			municao--;
		}
		else
			System.out.println("Sem Muni��o, Recarregue!");
			
	}
	
	void recarregar() {
		if(municao == municaoMaxima) 
			System.out.println("Pente Cheio, Imposs�vel Recarregar!");
		else {
			System.out.println("1 bala recarregada!");
		municao++;
		}
		
	}
	
	void verificarMunicao() {
		System.out.println("Muni��o atual: "+ municao);
	}
}
