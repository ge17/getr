package projeto.BO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.DAO.LancarDespesaDAO;
import projeto.beans.LancarDespesa;

public class LancarDespesaBO {
	
	private LancarDespesaDAO despesaDAO = new LancarDespesaDAO();
	
	public void inserir(LancarDespesa despesa){
		
		try{
			despesaDAO.incluir(despesa);
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}
	public List<LancarDespesa> listarDespesa(){
		try {
			
			return despesaDAO.listarDespesa();
			
		}catch(SQLException e){
			e.printStackTrace();
			return new ArrayList<LancarDespesa>();
		}
		
	}

}
