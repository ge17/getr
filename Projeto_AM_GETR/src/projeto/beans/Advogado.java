package projeto.beans;

public class Advogado extends Pessoa {
	
	private int nrOab, cpf;
	private String rg,senha;
	private TipoCausa tpCausa;
	
	
	public Advogado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Advogado(int cdPessoa, String nome, String tel, String end,
			String email) {
		super(cdPessoa, nome, tel, end, email);
		// TODO Auto-generated constructor stub
	}
	public Advogado(int nrOab, int cpf, String rg, String senha,
			TipoCausa tpCausa) {
		super();
		this.nrOab = nrOab;
		this.cpf = cpf;
		this.rg = rg;
		this.senha = senha;
		this.tpCausa = tpCausa;
		
		
	}
	public int getNrOab() {
		return nrOab;
	}
	public void setNrOab(int nrOab) {
		this.nrOab = nrOab;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public TipoCausa getTpCausa() {
		return tpCausa;
	}
	public void setTpCausa(TipoCausa tpCausa) {
		this.tpCausa = tpCausa;
	}
	
	

}
