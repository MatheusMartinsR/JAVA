package br.com.fiap.modelo;

public class Cliente {
	
	private String nome;
	private String cpf;
	private double rg;
	
	// Setters 
	public void setNome(String nome) {
		this.nome = nome;
		}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(double rg) {
		this.rg = rg;
		}
	
	// Getters
	public String getNome() {
		return nome;
		}
	
	public String getCpf() {
		return cpf;
		}
	public double getRg() {
		return rg;
	}
	

}
