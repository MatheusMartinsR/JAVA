package TesteMainFiapCaixaEletronico;

import SistemaCaixaEletronico.Cliente;
import SistemaCaixaEletronico.ContaCorrente;

public class TesteMainCaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente objCliente = new Cliente ();
		ContaCorrente objContaCorrente = new ContaCorrente();
		
		//Cliente
		
		objCliente.setNome("Matheus");
		objCliente.setEndereco("Avenida Paulista");
		objCliente.setCpf("497509");
		objCliente.setRg("53335");

		//ContaCorrente
		
		objContaCorrente.setAgencia("6625");
		objContaCorrente.setCliente("Matheus");
		objContaCorrente.setNumero("3000-5");
		objContaCorrente.setSaldo(40000);
		
		
		
		//Cliente
		
		System.out.println(objCliente.getNome());
		System.out.println(objCliente.getEndereco());
		System.out.println(objCliente.getCpf());
		System.out.println(objCliente.getRg());
		
		
		// ContaCorrente
		
		System.out.println(objContaCorrente.getAgencia());
		System.out.println(objContaCorrente.getCliente());
		System.out.println(objContaCorrente.getNumero());
		System.out.println(objContaCorrente.getSaldo());
		
		
		System.out.println("Nome: " + objCliente.getNome()+
				"\n" + "Cpf: " + objCliente.getCpf() + 
				"\n" + "Endereco: " + objCliente.getEndereco()+ 
				"\n" + "Rg: " + objCliente.getRg()+
				"\n" + "Agencia: " + objContaCorrente.getAgencia()+
				"\n" + "Numero: " + objContaCorrente.getNumero()+
				"\n" + "Saldo: " + objContaCorrente.getSaldo());
		
		
		
		
	}

}
