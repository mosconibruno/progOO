import java.io.IOException;

public class teste {

	public static void main(String[] args) throws IOException {

		Cachorro c = new Cachorro();
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		Gato g3 = new Gato();
		Gato g4 = new Gato();
		Gato g5 = new Gato();
		
		Zoo z = new Zoo();
		z.prender(g1);
		z.prender(g2);
		z.prender(g3);
		z.prender(g4);
		z.prender(g5);
		z.prender(c);
		z.todosEmitemSom();
		z.todosArranham();
		
		
		/*
			Animal a = new Gato();
			a.dormir();
			a.emitirSom();
			
			Gato g = (Gato) a; // Downcast
			g.arranhar();
			g.dormir();
			
			Gato h = new Gato();
			h.arranhar();
			
			Animal b = (Animal) h; // Upcast
			b.emitirSom();
		*/
		
	}

}
