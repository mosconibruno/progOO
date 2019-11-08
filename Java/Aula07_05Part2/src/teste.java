
public class teste {

	public static void main(String[] args) {

			Produto p = new Produto("Livro", 1000, new FinalDeSemana("Dia do prog"));
			System.out.println(p.calcularPreco());
	}

}
