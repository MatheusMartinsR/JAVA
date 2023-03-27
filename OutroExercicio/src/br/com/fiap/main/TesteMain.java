package br.com.fiap.main;

import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Pessoa;

public abstract class TesteMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Pessoa objPessoa = new Pessoa();
		Endereco objEndereco = new Endereco();
		
		// Entrada de valores
		
		//Pessoa
		
		objPessoa.setNome("Matheus");
		objPessoa.setCpf("77");
		objPessoa.setEndereco(objEndereco);
		
		//Endereco 
		
		objEndereco.setLogradouro("Rua Qualquer");
		objEndereco.setNumero("99");
		
		// Pessoa
		System.out.println("Nome da pessoa: " + objPessoa.getNome());
		System.out.println("CPF: " + objPessoa.getCpf());
		System.out.println("Endereco: " + objPessoa.getEndereco());
		
		//Endereco 
		
		System.out.println("Logradouro " + objEndereco.getLogradouro());
		System.out.println("Numero " +  objEndereco.getNumero());
		
		
		
		
		

	}

}
