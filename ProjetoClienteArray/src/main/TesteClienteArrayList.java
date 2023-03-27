package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import teste.Cliente;

public class TesteClienteArrayList {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		

	}

}
