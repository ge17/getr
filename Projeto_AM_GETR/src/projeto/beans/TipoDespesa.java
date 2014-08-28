package projeto.beans;

public class TipoDespesa {
	
	private int cdTipoDespesa;
	private String dsTipoDespesa;
	public TipoDespesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoDespesa(int cdTipoDespesa, String dsTipoDespesa) {
		super();
		this.cdTipoDespesa = cdTipoDespesa;
		this.dsTipoDespesa = dsTipoDespesa;
	}
	public int getCdTipoDespesa() {
		return cdTipoDespesa;
	}
	public void setCdTipoDespesa(int cdTipoDespesa) {
		this.cdTipoDespesa = cdTipoDespesa;
	}
	public String getDsTipoDespesa() {
		return dsTipoDespesa;
	}
	public void setDsTipoDespesa(String dsTipoDespesa) {
		this.dsTipoDespesa = dsTipoDespesa;
	}
	
	
	

}
