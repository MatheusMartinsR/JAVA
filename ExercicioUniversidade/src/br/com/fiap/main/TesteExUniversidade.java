package br.com.fiap.main;

import br.com.fiap.modelo1.Aluno;
import br.com.fiap.modelo1.Curso;

public class TesteExUniversidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno objAluno = new Aluno();
		Curso objCurso = new Curso();
		
		
		//Alunos
		
		objAluno.setNome("Matheus");
		objAluno.setRm("96505");
		objAluno.setIdade(19);
		objAluno.setCurso(objCurso);
		
		//Curso
		
		objCurso.setTipoCurso("Tecnologo");
		objCurso.setPeriodo("noite");
		objCurso.setValorCurso(2.100);
		
		
		
		//Alunos
		System.out.println(objAluno.getNome());
		System.out.println(objAluno.getRm());
		System.out.println(objAluno.getIdade());
		
		//Curso
		System.out.println(objCurso.getTipoCurso());
		System.out.println(objCurso.getPeriodo());
		System.out.println(objCurso.getValorCurso());

	}

}
