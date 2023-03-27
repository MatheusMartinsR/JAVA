package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import teste.Produto;

public class TesteArrayListProduto {
	
	
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
		
		List<Produto> listaProduto = new ArrayList<Produto> ();
		
		Produto objProduto = null;
		 
		int continuar = 0;
		
		while (continuar==0) {
			objProduto = new Produto();
			objProduto.setTipo(texto("Informe o tipo: "));
			objProduto.setMarca(texto("Informe a marca"));
			objProduto.setQuantidade(inteiro("Digite a quantidade: "));
			objProduto.setValor(decimal("Informe o valor: "));
			listaProduto.add(objProduto);
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar mais um item ao carrinho?",
					"Carrinho de compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
			
		}
		
		for(Produto produto : listaProduto) {
			System.out.println("TIpo: " + produto.getTipo() + 
					"\n" + "Marca: " + produto.getMarca() + 
					"\n" + "Quantidade: " + produto.getQuantidade() +
					"\n" + "Valor: " + produto.getValor());
		}
				
	}

}
