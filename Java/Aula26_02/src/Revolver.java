
public class Revolver {
	
	int municao, municaoMaxima;
	
	void atirar() {
		if(municao>0) {
			System.out.println("BANG!");
			municao--;
		}
		else
			System.out.println("Sem Munição, Recarregue!");
			
	}
	
	void recarregar() {
		if(municao == municaoMaxima) 
			System.out.println("Pente Cheio, Impossível Recarregar!");
		else {
			System.out.println("1 bala recarregada!");
		municao++;
		}
		
	}
	
	void verificarMunicao() {
		System.out.println("Munição atual: "+ municao);
	}
}
