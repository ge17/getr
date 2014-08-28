package projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.beans.LancarDespesa;

public class LancarDespesaDAO {
	
	
	public void incluir(LancarDespesa despesa) throws SQLException{
		
		Connection conexao = null;
		
		try{
			
			conexao = ConnectionManager.getInstance().getConnection();
			
			String insertSql ="INSERT INTO T_AM_GETR_LANCAR_DESPESA (cd_lancamento) VALUES (?)";
			
			PreparedStatement ps = conexao.prepareStatement(insertSql);
			
			ps.setInt(1, despesa.getCdDespesa());
			
			ps.executeUpdate();
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally {
			
			if (conexao != null){
				try {
					conexao.close();
				} catch (SQLException e){
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexão com o banco de dados!", e);
				}
			}
			
		}
		
	}
	public List<LancarDespesa> listarDespesa() throws SQLException{
	
	
	List<LancarDespesa> listarDespesa = new ArrayList<LancarDespesa>();
	
	Connection conexao = null;
	
		try{
			
			
			conexao = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = conexao.prepareStatement("SELECT * FROM T_AM_GETR_LANCAR_DESPESA");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				LancarDespesa despesa = new LancarDespesa();
				
				despesa.setCdDespesa(rs.getInt("cdDespesa"));
				
				listarDespesa.add(despesa);
				
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally {
			
			if (conexao != null){
				try {
					conexao.close();
				} catch (SQLException e){
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexão com o banco de dados!", e);
				}
			}
			
		}
		return listarDespesa;
	}
}
