package br.com.fiap.modelo;

public class Monitor {
	
	private String marca; 
	private double tamanho;
	private String tipo;
	
	public Monitor() {
		super();
	}
	
	public Monitor(String marca, int tamanho, String tipo) {
		super();
		this.marca = marca;
		this.tamanho = tamanho;
		this.tipo = tipo;
		
	}
	
	
	
	
	
	//Setters
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	// Getters 
	
	
	public String getMarca() {
		return marca;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	
	public String getTipo() {
		return tipo;
	}
	

}
