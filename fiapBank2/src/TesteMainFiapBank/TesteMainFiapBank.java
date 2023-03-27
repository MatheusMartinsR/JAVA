package TesteMainFiapBank;

import fiapBank2.Cliente;
import fiapBank2.ContaCorrente;
import fiapBank2.Endereco;

public class TesteMainFiapBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Cliente objCliente = new Cliente();
		ContaCorrente objContaCorrente = new ContaCorrente();
		Endereco objEndereco = new Endereco();
		
		
		//Cliente
		
		objCliente.setNome("Maria");
		objCliente.setCpf("497509");
		objCliente.setEndereco(objEndereco);
		
		//ContaCorrente
		
		objContaCorrente.setSaldo(20000);
		objContaCorrente.setTitular(objCliente);
		
		//Endereco
		
		objEndereco.setLogradouro("Rua Maria Siqueira");
		objEndereco.setNumero(860);
		
		
		//Cliente
		System.out.println(objCliente.getNome());
		System.out.println(objCliente.getCpf());
		System.out.println(objCliente.getEndereco());
		
		//ContaCorrente
		
		System.out.println(objContaCorrente.getSaldo());
		System.out.println(objContaCorrente.getTitular());
		
		System.out.println("Nome: " + objCliente.getNome() +
		"\nCpf: " + objCliente.getCpf() + 
		"\nSaldo: " + objContaCorrente.getSaldo() + 
		"\nLogradouro: " + objEndereco.getLogradouro() + 
		"\nNumero: " + objEndereco.getNumero());
		
		
		
	
		
		
		
		

	}

}
