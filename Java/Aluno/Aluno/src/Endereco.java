
public class Endereco {
	
	String logradouro, cep, cidade;
	Estado uf;
	
	public Endereco(String logradouro, String cep, String cidade, Estado uf) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public void mostrar() {
		System.out.println("Logradouro: " + logradouro);
	    System.out.println("CEP: " + cep);
	    System.out.println("Cidade: " + cidade);
	    System.out.println("UF: " + uf);
	}
	
    
}
