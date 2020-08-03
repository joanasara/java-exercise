package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional10 {

	public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite a quantidade atual do estoque");
		int quatAtual = leia.nextInt();
		
		System.out.println("Digite a quantidade maxima do estoque");
		int quatMax = leia.nextInt();
		
		System.out.println("Digite a quantidade minima do estoque");
		int quatMin = leia.nextInt();
		
		int media;
		
		
		media = (quatMax + quatMin)/2;
		
		if(quatAtual>=media) {
			
			System.out.println("Não efetuar compra");
			
		}else {
			
			System.out.println("Efetuar comprar");
		}
		
		
		
		
		
      leia.close();
	}

}
