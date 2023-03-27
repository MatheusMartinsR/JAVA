package br.com.fiap.modelo;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		}
	
	// Getters
	
	public String getNome() {
		return nome;
		}
	
	public String getCpf() {
		return cpf;
	}
	
	public Endereco getEndereco() {
		return endereco;
		}

}
