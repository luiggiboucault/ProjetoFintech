package br.com.newbank.banco;



public class ContaCorrente extends Conta {
	public ContaCorrente (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
        super.saldo += valor;
    }
	
	@Override
	public boolean sacar (double saldo, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true; 
		} else {
			return false;
		}
	}
	
	@Override
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
	
}
