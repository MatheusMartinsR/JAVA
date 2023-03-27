package Modelo;

public class Pessoa {
	
	private String nome; 
	private String email;
	private int idade;
	private Endereco endereco;

	
	//Construtor vazio 
	public Pessoa() {
		super();
	}
	
	//Construtor cheio
	public Pessoa(String nome, String email, int idade) {
		super();
	}
	
	//Construtor cheio com atributo de referencia
	public Pessoa(String nome, String email, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade; 
		this.endereco = endereco;
	}
}
