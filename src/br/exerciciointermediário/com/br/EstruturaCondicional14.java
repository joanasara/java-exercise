package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional14 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);	
			
			System.out.println("Digite o valor A");
			int a = leia.nextInt();
			
			System.out.println("Digite o valor B");
			int b = leia.nextInt();
			
			System.out.println("Digite o valor c");
			int c = leia.nextInt();
			
			
			if(a < b + c && c < a + b) {
				System.out.println("triagulo valido");
					
			}else {
				System.out.println("triagulo invalido");
				
			}
			
			
			
			
			
			leia.close();

	}

}
