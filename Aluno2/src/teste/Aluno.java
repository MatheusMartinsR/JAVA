package teste;

public class Aluno {
	
	private String nome;
	private String rm;
	private String turma;
	private int faltas;
	private double nota;
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String rm, String turma, int faltas, double nota) {
		super();
		this.nome = nome;
		this.rm = rm;
		this.turma = turma;
		this.faltas = faltas;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	
	
	
	

}
