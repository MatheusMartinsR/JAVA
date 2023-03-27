package Modelo;

public class Carro {
	
	private String modelo;
	private String fabricante;
	private float motor;
	private int velocidadeMaxima;
	
	//construtor vazio
	public Carro(){
		super();
	}
	//Construtor cheio
	public Carro(String modelo, String fabricante, float motor, int velocidadeMaxima){
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.motor = motor;
		this.velocidadeMaxima = velocidadeMaxima;
			
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
}
