package Modelo;

public class PessoaFisica extends Pessoa {
	
	
	private String rg; 
	private String cpf;
	
	//Construtor vazio 
	public PessoaFisica() {
		super();
	}
	
	//Construtor cheio 
	public PessoaFisica( String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	//Construtor cheio com herança 
	public PessoaFisica(String nome, int idade, String email, String rg, String cpf) {
		super(nome, idade, email);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	
	
}
