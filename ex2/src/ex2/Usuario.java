package ex2;

public class Usuario {
	private int id;
	private String nome;
	private int preco;
	
	public Usuario() {
		this.id = -1;
		this.nome = "";
		this.preco = 0;
	}
	
	public Usuario(int codigo, String nome, int preco) {
		this.id = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return id;
	}

	public void setCodigo(int codigo) {
		this.id= codigo;
	}

	public String getLogin() {
		return nome;
	}

	public void setLogin(String login) {
		this.nome = login;
	}

	
	public double getSexo() {
		return preco;
	}

	public void setSexo(int sexo) {
		this.preco = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + id + ", login=" + nome + ", preco=" + preco +"]";
	}	
}
