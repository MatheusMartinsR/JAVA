package Modelo;

public class Endereco {
	
	private String logradouro;
	
	//Construtor vazio
	public Endereco() {
		super();
	}
	
	//Construtor cheio
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	

}
