package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaSelecao6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();

		System.out.println("Digite o segundo valor");
		int valor2 = leia.nextInt();

		
		if(valor1==valor2) {
			System.out.println("Não serão lidos valores iguais");
			
		}
		else if(valor1>valor2) {
			System.out.println(valor1 + " valor1");
			System.out.println(valor2 + " valor2");
		}
		else if(valor2>valor1) {
			System.out.println(valor2 + " valor2");
			System.out.println(valor1 + " valor1");
			
		}
		
		
		
		leia.close();
	}

}
