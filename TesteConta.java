package br.com.fiap.Nano;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		
		cc.saldo = 50.0;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(1000);
		System.out.println("Saldo: " + cc.verificarSaldo());
		
		Conta poup = new Conta(111, 222, 1000);
		poup.retirar(50);
		System.out.println("Saldo: " + poup.verificarSaldo());
		
	}

}
