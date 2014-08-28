package projeto.teste;

import java.sql.SQLException;
import java.util.List;

import projeto.BO.LancarDespesaBO;
import projeto.beans.LancarDespesa;

public class Teste {
	
	public static void main(String[] args) {
		
		LancarDespesaBO despesaBO = new LancarDespesaBO();
		
		LancarDespesa despesa = new LancarDespesa();
		
		despesa.setCdDespesa(10);
		
		despesaBO.inserir(despesa);
		
		public static void listar(LancarDespesaBO despesaBO)throws SQLException {
			
			List<LancarDespesa> lista = despesaBO.listarDespesa();
			
			for (LancarDespesa despesa2 : lista){
				exibe(despesa2);
				
				
			}
			
		}
		public static void exibe(LancarDespesa despesa){
			System.out.println(despesa.getCdDespesa());
			
		}
	}
	}

}
