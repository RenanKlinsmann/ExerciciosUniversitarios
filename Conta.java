package entidades;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}


	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}
	public void deposito(double montante) {
		saldo += montante;
	}
	public void saque(double montante) {
		saldo -= montante + 5.0;
	}
	
	public String toString() {
		return "N° da Conta "
				+ numero
				+ ", Nome do Titular: "
				+ nome
				+ ", Montante: $ "
				+ String.format("%.2f", saldo);
	}
	
	

}
