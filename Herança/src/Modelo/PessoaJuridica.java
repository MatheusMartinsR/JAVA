package Modelo;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial; 
	private String cnpj;
	
	//Construtor vazio 
	public PessoaJuridica() {
		super();
	}
	
	//Construtor cheio 
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	//Construtor cheio com herança 
	public PessoaJuridica(String nome, int idade, String email) {
		super(nome, idade, email);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
