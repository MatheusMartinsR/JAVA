package teste;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String estado;
	private int numero;
	
	
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, String bairro, String estado, int numero) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.estado = estado;
		this.numero = numero;
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
