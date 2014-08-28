package projeto.beans;

public class TipoHonorario {
	
	private int cdTipoHonorario;
	private String dsTipoTarefa;
	public TipoHonorario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoHonorario(int cdTipoHonorario, String dsTipoTarefa) {
		super();
		this.cdTipoHonorario = cdTipoHonorario;
		this.dsTipoTarefa = dsTipoTarefa;
	}
	public int getCdTipoHonorario() {
		return cdTipoHonorario;
	}
	public void setCdTipoHonorario(int cdTipoHonorario) {
		this.cdTipoHonorario = cdTipoHonorario;
	}
	public String getDsTipoTarefa() {
		return dsTipoTarefa;
	}
	public void setDsTipoTarefa(String dsTipoTarefa) {
		this.dsTipoTarefa = dsTipoTarefa;
	}
	
	
	

}
