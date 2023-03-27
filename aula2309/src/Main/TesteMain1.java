package Main;

import javax.swing.JOptionPane;

import Modelo.Funcionario; 


public class TesteMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar objetos
				Funcionario objFuncionario = new Funcionario(JOptionPane.showInputDialog("Digite o nome"),
						Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora")),
						JOptionPane.showInputDialog("Digite o cargo"));

				// Entrada de dados

				
				objFuncionario.setNome(JOptionPane.showInputDialog("Digite o nome"));
				
				System.out.println("Nome: " + objFuncionario.getNome() + "\nValor Hora: " + objFuncionario.getValorHora()
						+ "\nCargo: " + objFuncionario.getCargo());

				System.out.println(objFuncionario.getExibirTudo());

				System.out.println("\nTotal Salário: " + objFuncionario.calcularTotalSalario(40));

				System.out.println("\nImposto de renda: " + objFuncionario.calcularIr(80, 12));
	}

}
