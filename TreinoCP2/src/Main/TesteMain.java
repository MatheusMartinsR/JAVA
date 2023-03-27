package Main;

import javax.swing.JOptionPane;

import Modelo.Cliente;
import Modelo.ContaCorrente;
import Modelo.Endereco;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Informe o nome: "),
				JOptionPane.showInputDialog("Digite o RG: "),
				JOptionPane.showInputDialog("Digite o CPF: "));
		
		System.out.println("Informações cliente: ");
		System.out.println("Nome: " + objCliente.getNome() +
				"\n Digite o RG: " + objCliente.getRg() + 
				"\n Digite o CPF: " + objCliente.getCpf());
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Informe o Logradouro: "));
		
		System.out.println("Informações de logradouro: ");
		System.out.println("Informe o endereco/logradouro: ");
		
		ContaCorrente objContaCorrente = new ContaCorrente(Integer.parseInt(JOptionPane.showInputDialog("Informe a agencia: ")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo: ")));
	}

}
