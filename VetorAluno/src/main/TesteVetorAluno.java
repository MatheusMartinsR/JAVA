package main;

import javax.swing.JOptionPane;

import teste.Aluno;

public class TesteVetorAluno {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j)};
	
		static double decimal (String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}

	public static void main(String[] args) {
		
		Aluno[] objVetorAluno = new Aluno[2];
		
		int indice =0;
		
		do {
			objVetorAluno[indice] = new Aluno(texto("Digite o nome"),
					texto("Digite o rm"), texto("Digite a turma", inteiro("Digite as faltas"),
							decimal("Informe a nota")));
							indice++;
			
		} while (JOptionPane.showConfirmDialog(null, "Cadastar mais alunos", "Cadastro de aluno",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		
		for(int contador -0; contador<indice; contador++) {
			System.out.println("Nome: " + objVetorAluno[contador].getNome()
					+ "\n" + "RM: " + objVetorAluno[contador].getRm()
					+ "\n" + "Turma: " + objVetorAluno[contador].getTurma()
					+ "\n" + "Faltas: " + objVetorAluno[contador].getFaltas()
					+ "\n" + "Notas: " + objVetorAluno[contador].getNota());
		}
		

	}

}
