
public class Cliente {

	private int id;
	private String nome;
	private String sobrenome;
	
	public Cliente(int id, String nome, String sobrenome) {
		
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	
}
