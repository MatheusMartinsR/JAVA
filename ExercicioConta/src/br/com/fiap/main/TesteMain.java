package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.ContaCorrente;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente objCliente = new Cliente();
		ContaCorrente objContaCorrente = new ContaCorrente();
		
		// Entrada de valores 
		
		// Cliente
		
	objCliente.setNome("Matheus");
	objCliente.setCpf("777");
	objCliente.setRg("666");
     
	objContaCorrente.getAgencia(8);
	objContaCorrente.setCliente(objCliente);
	objContaCorrente.setnumero(7);
	objContaCorrente.setSaldo(1000);
	
	
	System.out.println(objCliente.getNome());
	System.out.println(objCliente.getCpf());
	System.out.println(objCliente.getRg());
	
	System.out.println(objContaCorrente.getAgencia());
	System.out.println(objContaCorrente.getCliente());
	System.out.println(objContaCorrente.getNumero());
	System.out.println(objContaCorrente.getSaldo());
	
	
	

	}

}
