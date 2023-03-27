package Modelo;

public class Jeep extends Carro{
	
	private String tipoTracao;
	
	//Construtor vazio
	public Jeep() {
		super();
	}
	//Construtor cheio
	public Jeep(String modelo, String fabricante, float motor, int velocidadeMaxima, String tipoTracao) {
		super();
		this.tipoTracao = tipoTracao;
	}
	
	
	public String getTipoTracao() {
		return tipoTracao;
	}
	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	
	
	

}
