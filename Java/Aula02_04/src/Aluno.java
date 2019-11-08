
public class Aluno {
	private String nome, ra;
	private int idade;
	
	public Aluno(String nome, String ra, int idade) {
		this.nome = nome;
		this.ra = ra;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getRa() {
		return ra;
	}
	public int getIdade() {
		return idade;
	}
	
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("RA: " + ra);
		System.out.println("Idade: " + idade);
	}
	
}
