package br.com.fiap.Nano;

import java.util.Scanner;

public class NanoCourse {
	public static void main(String[] args) {

		int idade = 0;
		int maioridade = 18;
		Scanner scan;

		try {
			scan = new Scanner(System.in);
			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt();

			if(idade >= maioridade) {
				System.out.println("SEJA BEM VINDO!!");
			}else {
				System.out.println("Você não pode entrar!");
			}

		} catch (Exception e) {
			System.out.println("Formato incorreto, tente novamente");
		}



	}

}
