package br.com.fiap.modelo1;

public class Curso {
	
	private String tipoCurso;
	private String periodo;
	private double valorcurso;
	
	// Setters
	
	public void setTipoCurso(String tipoCurso) { 
		this.tipoCurso = tipoCurso;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public void setValorCurso(double valorcurso) {
		this.valorcurso = valorcurso;
		}
	
	// Getters
	
	public String getTipoCurso() {
		return tipoCurso;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	public double getValorCurso(double valorcurso) {
		return valorcurso;
	}
	
}
