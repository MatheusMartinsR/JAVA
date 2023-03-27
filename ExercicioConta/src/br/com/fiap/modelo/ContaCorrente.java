package br.com.fiap.modelo;

public class ContaCorrente {
	private String agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	// Setters 
	public void setAgencia(String agencia) {
		this.agencia = agencia;
		}
	
	public void setnumero(int numero) {
		this.numero = numero;
		}
	public void setSaldo(double saldo) {
		this.saldo = saldo; 
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		}
	
	// Getters 
	public String getAgencia() {
		return agencia;
		}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

}
