package main;

import javax.swing.JOptionPane;

import teste.Aluno;

public class Teste {

	public static void main(String[] args) {
		
		Aluno[] objVetorAluno = new Aluno[3];
		
		int indice=0;
		
		int resposta=0;
		
		while(resposta == 0) {
			objVetorAluno[indice] = new Aluno(JOptionPane.showInputDialog("Nome do aluno: "),
					Double.parseDouble(JOptionPane.showInputDialog("Digite a média: ")),
					Integer.parseInt(JOptionPane.showInputDialog("Faltas:")),
					Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno: "))); 
			indice++;
			resposta = JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?", "Cadastro de Aluno",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for(int contador = 0; contador < indice; contador ++) {
			System.out.println("Nome do aluno: " + objVetorAluno[contador].getNome() + 
					"\n" + "Média de nota: " + objVetorAluno[contador].getMedia() + 
					"\n" + "Faltas do aluno: " + objVetorAluno[contador].getFaltas() +
					"\n" + "Idade do aluno: " + objVetorAluno[contador].getIdade()); 
			
		}
		
		
		
		

	}

}
