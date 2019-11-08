
public class teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alexsandro", 50);
		Aluno a2 = new Aluno("Márcio", 60);
		Aluno a3 = new Aluno("Félix", 22);
		Disciplina d = new Disciplina("COBOL");
		d.matricular("0050481623001", a1);
		d.matricular("0050481623020", a2);
		d.matricular("0050481621017", a3);
		// O HashCode determina a ordem de "Inserção" no HashMap.
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		d.listarAlunos();

	}

}
