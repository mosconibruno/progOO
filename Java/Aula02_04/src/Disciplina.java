
public class Disciplina {
	private String nome;
	//evitar get no vetor
	private Aluno[] alunos;
	private int qtAtual;
	
	public Disciplina(String nome, int maxAluno) {
		this.nome = nome;
		this.alunos = new Aluno[maxAluno];
	}

	public String getNome() {
		return nome;
	}

	public int getQtAtual() {
		return qtAtual;
	}
	
	public void matricular(Aluno a) {
		alunos[qtAtual++] = a;
		//qtAtual++
	}
	
	public void removerUltimo() {
		//qtAtual--
		alunos[--qtAtual] = null;
	}
	
	public void mostrarAluno() {
		for(int i = 0; i < qtAtual; i++) {
			alunos[i].mostrarInfo();
		}
	}
}
