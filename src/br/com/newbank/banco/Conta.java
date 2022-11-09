package br.com.newbank.banco;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente Titular;
	
public Conta (int agencia, int numero) {
	this.agencia = agencia;
	this.numero = numero;
}
	
public abstract void depositar(double valor);

public boolean sacar (double saldo, double valor) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
		return true; 
	} else {
		return false;
	}
}

public boolean transferir (double valor, Conta contaDestino) {
	if (this.saldo >= valor) {
		this.saldo -= valor;
		contaDestino.saldo += valor;
		return true;
	}
	else { 
		return false;
	}
}
 
public double getSaldo() {
	return saldo;
}
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Cliente getTitular() {
	return Titular;
}
public void setTitular(Cliente titular) {
	Titular = titular;
}
}
