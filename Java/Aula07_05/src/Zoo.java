import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animal> jaula;
	
	public Zoo() {
		jaula = new ArrayList<Animal>();
	}
	
	public void prender(Animal a) {
		if (a != null) {
		jaula.add(a);
		System.out.println("Animal Preso");
		}
	}
	
	public void todosEmitemSom() {
		for(Animal a: jaula) {
			a.emitirSom();
		}		
	}
	
	public void todosArranham() {
		for(Animal a: jaula) {
			if (a instanceof Gato)
				((Gato) a).arranhar();
		}
	}
}
