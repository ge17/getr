package projeto.beans;

public class Forum extends Pessoa {
	
	private String cdForum;
	private String dsForum;
	
	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Forum(int cdPessoa, String nome, String tel, String end, String email) {
		super(cdPessoa, nome, tel, end, email);
		// TODO Auto-generated constructor stub
	}
	
	
	public Forum(String cdForum, String dsForum) {
		super();
		this.cdForum = cdForum;
		this.dsForum = dsForum;
	}
	public String getCdForum() {
		return cdForum;
	}
	public void setCdForum(String cdForum) {
		this.cdForum = cdForum;
	}
	public String getDsForum() {
		return dsForum;
	}
	public void setDsForum(String dsForum) {
		this.dsForum = dsForum;
	}

}
