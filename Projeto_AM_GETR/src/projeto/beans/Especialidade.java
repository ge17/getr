package projeto.beans;

public class Especialidade {
	
	private int cdEspecialidade;
	private String dsEspecialidade;
	public Especialidade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Especialidade(int cdEspecialidade, String dsEspecialidade) {
		super();
		this.cdEspecialidade = cdEspecialidade;
		this.dsEspecialidade = dsEspecialidade;
	}
	public int getCdEspecialidade() {
		return cdEspecialidade;
	}
	public void setCdEspecialidade(int cdEspecialidade) {
		this.cdEspecialidade = cdEspecialidade;
	}
	public String getDsEspecialidade() {
		return dsEspecialidade;
	}
	public void setDsEspecialidade(String dsEspecialidade) {
		this.dsEspecialidade = dsEspecialidade;
	}
	
	

}
