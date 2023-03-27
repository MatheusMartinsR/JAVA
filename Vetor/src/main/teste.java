package main;

import javax.swing.JOptionPane;

import teste.aluno;

public class teste {

	public static void main(String[] args) {
		
		
		aluno[] objVetorAluno = new aluno[2];
		
		int indice =0;
		
		//do
		objVetorAluno[indice] = new aluno(JOptionPane.showInputDialog("Digite o nome"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a média")),
				Integer.parseInt(JOptionPane.showInputDialog("Faltas")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
				indice ++;
				
		//while 
		while (JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?", "Cadastro de alunos",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
				
	}

}
