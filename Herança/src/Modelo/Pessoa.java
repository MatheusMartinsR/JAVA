package Modelo;

public class Pessoa {
	
	private String nome; 
	private int idade;
	private Endereco endereco;
	private String email;
	
	//Construtor vazio 
	public Pessoa() {
		super();
	}
	
	//Construtor cheio só com as variaveis da propria classe
	public Pessoa(String nome, int idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
