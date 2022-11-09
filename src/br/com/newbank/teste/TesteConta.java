package br.com.newbank.teste;

import br.com.newbank.banco.ContaCorrente;
import br.com.newbank.banco.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente contac = new ContaCorrente(123, 1234);
		contac.depositar(200);
		System.out.println(contac.getSaldo());
		
		ContaPoupanca contap = new ContaPoupanca(432, 4334);
		contap.depositar(500);
		System.out.println(contap.getSaldo());
		contap.transferir(300, contac);
		System.out.println(contac.getSaldo());
	}


}
