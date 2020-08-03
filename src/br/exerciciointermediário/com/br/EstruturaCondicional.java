package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite um numero");
		int valor = leia.nextInt();
		
		
		if(valor==0) {
			
			System.out.println("valor = " + valor);
			
		}
		else if(valor>0) {
			
			System.out.println("valor positivo");
		}
		else if(valor<0) {
			
			System.out.println("valor negativo");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
