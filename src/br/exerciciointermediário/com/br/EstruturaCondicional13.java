package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional13 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o primeiro valor");
		int valor3 = leia.nextInt();
		
		int soma =0;
		
	 if(valor1>valor2&&valor1>valor3&&valor2>valor3) {
		 soma = valor1 + valor2;
			System.out.println("A soma dos valores 1 e 2 " + soma);
			
		}
		else if(valor2>valor1&&valor2>valor3&&valor3>valor1) {
			soma = valor2 + valor3;
			System.out.println("A soma dos valores 2 e 3 = " + soma);
			
		}
		else if(valor3>valor1&&valor3>valor2&&valor1>valor2) {
			soma = valor3 + valor1;
			System.out.println("A soma dos valores 3 e 1 = " + soma);
		}
		else if(valor3>valor1&&valor3>valor2&&valor2>valor1) {
			soma = valor3 + valor2;
			System.out.println("A soma dos valores 3 e 2 = " + soma);
		}
		
		
		
		leia.close();


	}

}
