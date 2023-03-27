package TesteMain;

import br.com.fiap.modelo.Monitor;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Computador;

public class TesteMainComputador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Monitor objMonitor = new Monitor(JOptionPane.showInputDialog("Digite a marca"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a polegada")),
				JOptionPane.showInputDialog("Digite o tipo"));
				
		Computador objComputador = new Computador(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),
				JOptionPane.showInputDialog("Digite o fornecedor"));
		
		
		
		//Monitor
		
		objMonitor.setMarca("Acer");
		objMonitor.setTamanho(24.2);
		objMonitor.setTipo("144hz");
		
		
		// Computador 
		
		objComputador.setValor(3000);
		objComputador.setFornecedor("Redragon");
		objComputador.setMonitor(objMonitor);
		
		
		
		// Monitor 
		 
		System.out.println(objMonitor.getMarca());
		System.out.println(objMonitor.getTamanho());
		System.out.println(objMonitor.getTipo());
		
		
		
		// Computador
		
		System.out.println(objComputador.getValor());
		System.out.println(objComputador.getFornecedor());
		System.out.println(objComputador.getMonitor());
		
		
		
		System.out.println("Marca: " + objMonitor.getMarca() + 
		"\nTamanho: " + objMonitor.getTamanho() + 
		"\nTipo: " + objMonitor.getTipo() + 
		"\nValor: " + objComputador.getValor() + 
		"\nFornecedor: " + objComputador.getFornecedor());
		
	}

}
