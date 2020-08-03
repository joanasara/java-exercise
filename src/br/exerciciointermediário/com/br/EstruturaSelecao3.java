package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2 = leia.nextDouble();
		
		double media;
		
		media = (nota1 + nota2)/2;
		
		if(media>=6) {
			System.out.println("APROVADO");
			System.out.printf("sua nota = %.1f ", media);
			
		}
		else if(media<6) {
			System.out.println("REPROVADO");
			System.out.printf("sua nota = %.1f ", media);
		}
		
		
		
		
		
		
		leia.close();

	}

}
