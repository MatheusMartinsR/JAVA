package Main;

import javax.swing.JOptionPane;

import Modelo.Formula1;
import Modelo.Jeep;

public abstract class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formula1 objF = new Formula1(JOptionPane.showInputDialog("Informe o modelo:"),
				JOptionPane.showInputDialog("Qual Fabricante: "),
				Float.parseFloat(JOptionPane.showInputDialog("Tipo de motor: ")),
				Integer.parseInt(JOptionPane.showInputDialog("Velocidade Máxima: ")),
				JOptionPane.showInputDialog("Informe a quipe: "));
		
		System.out.println("Informações Carro Formula1");
		
		System.out.println("Modelo: " + objF.getModelo() + 
				"\n Fabricante: " + objF.getFabricante() +
				"\n Tipo de motor: " + objF.getMotor() +
				"\n Velocidade máxima: " + objF.getVelocidadeMaxima() +
				"\n Informe a equipe: " + objF.getEquipe());
		
		Jeep objJeep = new Jeep(JOptionPane.showInputDialog("Informe o modelo:"),
				JOptionPane.showInputDialog("Qual Fabricante: "),
				Float.parseFloat(JOptionPane.showInputDialog("Tipo de motor: ")),
				Integer.parseInt(JOptionPane.showInputDialog("Velocidade Máxima: ")),
				JOptionPane.showInputDialog("Informe a quipe: "));
				JOptionPane.showInputDialog("Informe o tipo de tração: ");

	}

}
