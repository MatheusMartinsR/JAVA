package br.com.fiap.modelo1;

public class Aluno {
	
	private String nome;
	private String rm;
	private int idade;
	private Curso curso;
	
	// Setters
	
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	public void setRm(String rm) {
		this.rm = rm;
		}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	//Getters 
	
	public String getNome() {
		return nome;
	}
    
	public String getRm() {
		return rm;
	}
	
	public int setIdade() {
		return idade;
	}
	
}
