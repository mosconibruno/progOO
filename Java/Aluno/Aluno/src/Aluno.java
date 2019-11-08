
public class Aluno {

	String nome;
	Endereco endereco;
	Curso curso;
	public Aluno(String nome, Endereco endereco, Curso curso) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
	}
	
	public void mostrarAluno() {
		System.out.println("Nome: " + nome);
		endereco.mostrar();
		System.out.println("Curso: " + curso);
	}
	
}
