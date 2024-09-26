package br.com.fiap.Nano;

import java.util.Scanner;

public class calculandoIMC {

	public static void main(String[] args) {
		
		double altura = 0, imc = 0.0f;
		float peso = 0.0f;
		
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a sua altura em metros(utilize ','): ");
			altura = scan.nextDouble();
			
			System.out.println("Digite seu peso: ");
			peso = scan.nextFloat();
		} catch (Exception e) {
			System.out.println("Formato errado! Tente novamente.");
		}
		
		imc = peso/(altura * altura);
		
		if(imc > 18.5 && imc < 25) {
			System.out.println("\nSeu IMC é: " + imc);
			System.out.println("Você está no peso saudável!");
		} else {
			System.out.println("Seu peso não é saudável para a sua altura!");
		}

	}

}
