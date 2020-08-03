package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor");
		int valor3 = leia.nextInt();
		
		
		if(valor1 == valor2 && valor1 == valor3 && valor2==valor3) {
			//System.out.println("não serão informados valores iguais");
		}
		else if(valor1>valor2&&valor1>valor3) {
			System.out.println("o valor1 e maior" + valor1);
			
		}
		else if(valor2>valor1&&valor2>valor3) {
			System.out.println("o valor2 e maior " + valor2);
			
		}
		else if(valor3>valor1&&valor3>valor2) {
			System.out.println("o valor3 e maior " + valor3);
		}
		
		
		
		
		leia.close();

	}

}
