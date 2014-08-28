package projeto.beans;

public class Pessoa {
	
	private int cdPessoa;
	private String nome, tel, end, email;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(int cdPessoa, String nome, String tel, String end, String email) {
		super();
		this.cdPessoa = cdPessoa;
		this.nome = nome;
		this.tel = tel;
		this.end = end;
		this.email = email;
	}
	
	public int getCdPessoa() {
		return cdPessoa;
	}
	public void setCdPessoa(int cdPessoa) {
		this.cdPessoa = cdPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
}
