package projeto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static ConnectionManager instance;
	
	private ConnectionManager() throws ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	}
	
	public static ConnectionManager getInstance() throws SQLException{
		
		try{
			
			if(instance == null){
				instance = new ConnectionManager();
			}
		}
		catch(ClassNotFoundException e){
			throw new SQLException("O Driver JDBC não foi encontrado!");
		}
		return instance;
	}
	public Connection getConnection() throws SQLException {
		
		String user = "OPS$RM70019";
		String password = "123456";
		//String url = "jdbc:oracle:thin:/:@localhost:1521:xe";
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		
		try{
			
			return DriverManager.getConnection(url, user, password);
			
		}
		catch(SQLException e){
			e.printStackTrace();
			throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
			
		}
		
		
	}
	

}
