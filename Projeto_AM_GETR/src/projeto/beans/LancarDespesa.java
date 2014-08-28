package projeto.beans;

import java.io.Serializable;

public class LancarDespesa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cdDespesa;
	private TipoDespesa cdTipoDespesa;
	private Processo processo;
	private String dtDespesa;
	private Double vlDespesa;
	private String dsObservacao;
	public LancarDespesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LancarDespesa(int cdDespesa, TipoDespesa cdTipoDespesa,
			Processo processo, String dtDespesa, Double vlDespesa,
			String dsObservacao) {
		super();
		this.cdDespesa = cdDespesa;
		this.cdTipoDespesa = cdTipoDespesa;
		this.processo = processo;
		this.dtDespesa = dtDespesa;
		this.vlDespesa = vlDespesa;
		this.dsObservacao = dsObservacao;
	}
	public int getCdDespesa() {
		return cdDespesa;
	}
	public void setCdDespesa(int cdDespesa) {
		this.cdDespesa = cdDespesa;
	}
	public TipoDespesa getCdTipoDespesa() {
		return cdTipoDespesa;
	}
	public void setCdTipoDespesa(TipoDespesa cdTipoDespesa) {
		this.cdTipoDespesa = cdTipoDespesa;
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public String getDtDespesa() {
		return dtDespesa;
	}
	public void setDtDespesa(String dtDespesa) {
		this.dtDespesa = dtDespesa;
	}
	public Double getVlDespesa() {
		return vlDespesa;
	}
	public void setVlDespesa(Double vlDespesa) {
		this.vlDespesa = vlDespesa;
	}
	public String getDsObservacao() {
		return dsObservacao;
	}
	public void setDsObservacao(String dsObservacao) {
		this.dsObservacao = dsObservacao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
