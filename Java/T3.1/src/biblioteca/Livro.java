package biblioteca;

public class Livro {
	private String nome, autor;
	private int ano;
	
	public Livro(String nome, String autor, int ano) {
		
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
	
	
	
}
