package SistemaCaixaEletronico;

public class ContaCorrente {
	
	private String agencia;
	private String numero;
	private int saldo;
	private String cliente;
	
	
	// Setters
	
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	// Getters
	
	
	public String getAgencia() {
		return agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public String getCliente() {
		return cliente;
	}

	


}
