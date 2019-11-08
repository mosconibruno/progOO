
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endereco e = new Endereco("Rua: Teste", "1107777", "Santos", Estado.SP);
		
		Aluno a = new Aluno("Lula", e, Curso.ADS);
		
		a.mostrarAluno();
		
		
	}

}
