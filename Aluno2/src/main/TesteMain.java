package main;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import teste.Aluno;

public class TesteMain {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Aluno objAluno;
		
		do {
			objAluno = new Aluno();
			objAluno.setNome(texto("Digite o nome do aluno: "));
			objAluno.setRm(texto("Digite o rm"));
			objAluno.setTurma(texto("Digite a turma: "));
			objAluno.setFaltas(inteiro("Digite a quantidade de faltas: "));
			objAluno.setNota(decimal("Digite a nota: "));
		
		} while(JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?", "Cadastro de alunos",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0);
		
		for(Aluno aluno : listaAlunos) {
			System.out.println("Nome: " + aluno.getNome() + 
					"\n" + aluno.getRm() +
					"\n" + aluno.getTurma() + 
					"\n" + aluno.getFaltas() + 
					"\n" + aluno.getNota());
					;
		}

	}

}
