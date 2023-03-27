package br.com.fiap.modelo1;

public class ContaCorrente {
	//
	private double saldo;
	private Cliente titular;
	
	//Setters 
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	
	//Getters 
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
