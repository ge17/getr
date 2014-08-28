package projeto.beans;

public class Cliente extends Pessoa {
	
	private String razaoSocial, senha;
	private int cnpj, nrInsc;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int cdPessoa, String nome, String tel, String end,
			String email) {
		super(cdPessoa, nome, tel, end, email);
		// TODO Auto-generated constructor stub
	}
	public Cliente(String razaoSocial, String senha, int cnpj, int nrInsc) {
		super();
		this.razaoSocial = razaoSocial;
		this.senha = senha;
		this.cnpj = cnpj;
		this.nrInsc = nrInsc;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getNrInsc() {
		return nrInsc;
	}
	public void setNrInsc(int nrInsc) {
		this.nrInsc = nrInsc;
	}
}
