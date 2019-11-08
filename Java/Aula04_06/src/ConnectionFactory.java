import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException {
		// postgresql:localhost:5432 em casa
		// IP Externo 200.144.12.218
		//havij
		
		return DriverManager.getConnection("jdbc:postgresql://10.66.32.4:5103/postgres", "postgres", "123");
	}

}
