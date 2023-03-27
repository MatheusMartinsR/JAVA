package Main;

import javax.swing.JOptionPane;

import Modelo.Endereco;
import Modelo.PessoaFisica;
import Modelo.PessoaJuridica;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//INSTANCIAR OS OBJETOS
		PessoaFisica objPF = new PessoaFisica(JOptionPane.showInputDialog("Digite o nome"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa física")),
				JOptionPane.showInputDialog("Digite o email"), JOptionPane.showInputDialog("Digite o rg"),
				JOptionPane.showInputDialog("Digite o cpf"));
		
		
		PessoaJuridica objPj = new PessoaJuridica(JOptionPane.showInputDialog("Digite a razão social"),
				JOptionPane.showInputDialog("Digite o cnpj"));
		
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Digite o logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
		
		
		System.out.println("Pessoa Física\n");
		System.out.println("\n Nome da Pessoa Física: " + objPF.getNome() + 
		"\n Rg: " + objPF.getRg() + 
		"\n Email: " + objPF.getEmail());
		
		
		
	}

}
