package teste;

public class Cliente {
	
	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	
	
	public Cliente() {
		super();
	}


	public Cliente(String nome, int idade, double peso, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.endereco = endereco;
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


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	

	
	
	
	
	

}
