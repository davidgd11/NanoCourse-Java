package br.com.fiap.Nano;

import javax.swing.JOptionPane;

public class calculandoIMCJOP {

	public static void main(String[] args) {
		
		double altura = 0, imc = 0;
		float peso = 0.0f;
		
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Digite a sua altura (utilize '.'): ");
			altura = Double.parseDouble(aux);
			
			aux = JOptionPane.showInputDialog("Digite o seu peso: ");
			peso = Float.parseFloat(aux);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto, tente novamente!");
		}
		
		imc = peso/(altura * altura);
		
		if (imc > 18.5 && imc < 25) {
			JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + "\nVocê está com o peso saudável!");
		} else {
			JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + "\nVocê não está com um peso saudável!");
		}

	}

}
