package Modelo;

public class Formula1 extends Carro {
	
	private String equipe;
	
	//Construtor vazio
	public Formula1(){
		super();
	}
	//Construtor cheio
	public Formula1(String modelo, String fabricante, float motor, int velocidadeMaxima, String equipe){
		super(modelo, fabricante, motor, velocidadeMaxima);
		this.equipe = equipe;
	}
	
	
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	

}
 