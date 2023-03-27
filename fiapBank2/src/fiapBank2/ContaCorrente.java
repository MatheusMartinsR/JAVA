package fiapBank2;

public class ContaCorrente {
	
	 double saldo;
	 Cliente titular;
	
	 
	 
	 //Setters
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Getters
	
	
	 public double getSaldo() {
			return saldo;
		}
	 
	 public Cliente getTitular() {
			return titular;
		}
	
	
	
}
