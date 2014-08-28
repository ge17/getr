package projeto.beans;

public class Processo {
	
	private int nrProcesso, cdAdvogado, cdCliente, cdForum, causa;
	private String dtAbertura, dtFechamento;
	private boolean situacao, resultado;
	public Processo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Processo(int nrProcesso, int cdAdvogado, int cdCliente, int cdForum,
			int causa, String dtAbertura, String dtFechamento, boolean situacao,
			boolean resultado) {
		super();
		this.nrProcesso = nrProcesso;
		this.cdAdvogado = cdAdvogado;
		this.cdCliente = cdCliente;
		this.cdForum = cdForum;
		this.causa = causa;
		this.dtAbertura = dtAbertura;
		this.dtFechamento = dtFechamento;
		this.situacao = situacao;
		this.resultado = resultado;
	}
	public int getNrProcesso() {
		return nrProcesso;
	}
	public void setNrProcesso(int nrProcesso) {
		this.nrProcesso = nrProcesso;
	}
	public int getCdAdvogado() {
		return cdAdvogado;
	}
	public void setCdAdvogado(int cdAdvogado) {
		this.cdAdvogado = cdAdvogado;
	}
	public int getCdCliente() {
		return cdCliente;
	}
	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}
	public int getCdForum() {
		return cdForum;
	}
	public void setCdForum(int cdForum) {
		this.cdForum = cdForum;
	}
	public int getCausa() {
		return causa;
	}
	public void setCausa(int causa) {
		this.causa = causa;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public String getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	
	
	

}
