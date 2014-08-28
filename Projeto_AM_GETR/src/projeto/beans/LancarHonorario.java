package projeto.beans;

public class LancarHonorario {
	
	private int cdLancaHonorario, qtdHora;
	private Processo cdProcesso;
	private TipoHonorario tpHonorario;
	private String dtHonorario;
	private String dsObservacao;
	public LancarHonorario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LancarHonorario(int cdLancaHonorario, int qtdHora,
			Processo cdProcesso, TipoHonorario tpHonorario, String dtHonorario,
			String dsObservacao) {
		super();
		this.cdLancaHonorario = cdLancaHonorario;
		this.qtdHora = qtdHora;
		this.cdProcesso = cdProcesso;
		this.tpHonorario = tpHonorario;
		this.dtHonorario = dtHonorario;
		this.dsObservacao = dsObservacao;
	}
	public int getCdLancaHonorario() {
		return cdLancaHonorario;
	}
	public void setCdLancaHonorario(int cdLancaHonorario) {
		this.cdLancaHonorario = cdLancaHonorario;
	}
	public int getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(int qtdHora) {
		this.qtdHora = qtdHora;
	}
	public Processo getCdProcesso() {
		return cdProcesso;
	}
	public void setCdProcesso(Processo cdProcesso) {
		this.cdProcesso = cdProcesso;
	}
	public TipoHonorario getTpHonorario() {
		return tpHonorario;
	}
	public void setTpHonorario(TipoHonorario tpHonorario) {
		this.tpHonorario = tpHonorario;
	}
	public String getDtHonorario() {
		return dtHonorario;
	}
	public void setDtHonorario(String dtHonorario) {
		this.dtHonorario = dtHonorario;
	}
	public String getDsObservacao() {
		return dsObservacao;
	}
	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}
	
	
	

}
