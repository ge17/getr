package projeto.beans;

public class ValorHora {
	
	private int cdVlHora;
	private Advogado cdAvogado;
	private String dtVigencia;
	private double vlHora;
	public ValorHora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ValorHora(int cdVlHora, Advogado cdAvogado, String dtVigencia,
			double vlHora) {
		super();
		this.cdVlHora = cdVlHora;
		this.cdAvogado = cdAvogado;
		this.dtVigencia = dtVigencia;
		this.vlHora = vlHora;
	}
	public int getCdVlHora() {
		return cdVlHora;
	}
	public void setCdVlHora(int cdVlHora) {
		this.cdVlHora = cdVlHora;
	}
	public Advogado getCdAvogado() {
		return cdAvogado;
	}
	public void setCdAvogado(Advogado cdAvogado) {
		this.cdAvogado = cdAvogado;
	}
	public String getDtVigencia() {
		return dtVigencia;
	}
	public void setDtVigencia(String dtVigencia) {
		this.dtVigencia = dtVigencia;
	}
	public double getVlHora() {
		return vlHora;
	}
	public void setVlHora(double vlHora) {
		this.vlHora = vlHora;
	}
	
	
	

}
