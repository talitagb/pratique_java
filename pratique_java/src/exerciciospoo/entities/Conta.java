package exerciciospoo.entities;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldo;

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public Conta(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposito(double quantia) {
		saldo += quantia;
		
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", Titular: "
				+ titular
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo); 
	}
}
