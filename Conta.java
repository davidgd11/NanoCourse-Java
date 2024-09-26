package br.com.fiap.Nano;

public class Conta {

	//Atributos de classes 
	int agencia, numero;
	double saldo;
	
	public Conta() {}
	
	/*
	 * Construtor de classe
	 * Classe conta
	 */
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
	
	
	
}
