package main;

import javax.swing.JOptionPane;

import teste.Produto;

public class TesteVetorProduto {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.ParseInt(JOptionPane.showInputDialog(j));
		
	}
	
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		Produto[] objVetorProduto = new Produto[2];
		
		int indice =0, resposta=0;
		
		while(resposta==0) {
			objVetorProduto[indice] = new Produto(texto("Digite a marca"),
					inteiro("Digite a quantidade "), decimal("Digite o valor"));
			indice++;
			resposta = JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?",
					"Carrinho de compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}
	
		for (int contador=0; contador<indice; contador++) {
			System.out.println("Marca: " + objVetorProduto[contador].getMarca()
				+ "\n" "valor: " objVetorProduto[contador].getValor());
		}
		

	}

}
