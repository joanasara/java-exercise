package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time");
		String time1 = leia.next();
		System.out.println("Digite o numero de gols do time " + time1);
		int gol1 = leia.nextInt();
		
		
		System.out.println("Digite o nome do segundo time");
		String time2 = leia.next();
		System.out.println("Digite o numero de gols do time " + time2);
		int gol2 = leia.nextInt();
		
		if(gol1 == gol2) {
			
			System.out.println("time deu empate");
		}
		else if(gol1>gol2) {
			System.out.println("O time " + time1 + " fez " + gol1 + " ganhou o jogo");
			
		}
		else if(gol2>gol1) {
			System.out.println("O time " + time2 + " fez " + gol2 + " ganhou o jogo");
			
		}
		
		
		
		
		
		
		
		
       leia.close();
	}

}
