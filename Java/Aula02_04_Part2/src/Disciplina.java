import java.util.HashMap;
import java.util.Map.Entry;

public class Disciplina {
	private String nome;
	// Cria uma indexa��o de String
	// Meus valores ser�o Alunos
	private HashMap<String,Aluno> alunos;
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.alunos = new HashMap<String,Aluno>();
	}
	
	public void matricular(String ra, Aluno a) {
		alunos.put(ra, a);
	}
	
	public Aluno buscarAluno(String ra) {
		return alunos.get(ra);
	}
	
	public void listarAlunos() {
		for(Entry<String,Aluno> reg : alunos.entrySet()) {
			System.out.println(reg.getKey());
			reg.getValue().mostrarInfo();
		}
	}

	public String getNome() {
		return nome;
	}
}
