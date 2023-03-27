package br.com.fiap.modelo;

public class Computador {
	
	private double valor;
	private String fornecedor;
	private Monitor monitor;
	
	//Construtor vazio
	public Computador() {
		super();
	}
	public Computador(double valor, String fornecedor) {
		super();
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	//Cheio
	public Computador(double valor, String fornecedor, Monitor monitor) {
		super();
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.monitor = monitor;
	}
	
	
	
	
	// Setters
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	} 
	
	
	
	// Getters
	public double getValor() {
		return valor;
	}	
	
	public String getFornecedor() {
			return fornecedor;
		}
	
	public Monitor getMonitor() {
		return monitor;
	}
	
	

}
