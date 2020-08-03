package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo valor ");
		int valor2 = leia.nextInt();
		
		
		if(valor1==valor2) {
			System.out.println("numeros iguais");
		}
		else if(valor1>valor2) {
			System.out.println("O primeiro numero e maior");
			
		}
		else if(valor2>valor1) {
			System.out.println("o segundo valor e maior");
			
		}
		
		leia.close();

	}

}
