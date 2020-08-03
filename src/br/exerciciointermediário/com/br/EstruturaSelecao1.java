package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaSelecao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = leia.nextInt();
		
		if(valor>=0) {
			System.out.println("positivo");
			
		}
		else if(valor<0) {
			System.out.println("negativo");
		}
		
		
		
		
		
		
     leia.close();
	}

}
