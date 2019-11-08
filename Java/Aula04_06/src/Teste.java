import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
       Cliente c = new Cliente (0, "Vini", "Programador Nato");
		
		ClienteDAO cdao = new ClienteDAO();
		cdao.insert(c);;
		System.out.println("FIM");
		
	}

}
