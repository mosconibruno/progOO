import java.util.ArrayList;

public class DisciplinaD {
	private String nome;
	private ArrayList<Aluno> alunos;
	
	public DisciplinaD(String nome) {
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}
	
	public void matricular(Aluno a) {
		if (a != null)
			alunos.add(a);
	}
	
	public void remover(Aluno a) {
		if(alunos.remove(a))
			System.out.println(a.getNome() + " removido!");
		else
			System.out.println("Aluno não encontrado");
	}
	
	public void removerPeloIndice(int i) {
		if(i < 0 || i >= alunos.size())
			System.out.println("Erro");
		else	
			alunos.remove(i);
	}
	
	public int buscarAluno(Aluno a) {
		// se não achar devolve -1
		return alunos.lastIndexOf(a);
	}
	
	public Aluno selecionarAluno(int i) {
		return alunos.get(i);
	}
	
	public void listarAlunos() {
		for(Aluno a : alunos) {
			a.mostrarInfo();
		}
	}
}
