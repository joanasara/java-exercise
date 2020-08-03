package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaSelecao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo");
		int horaInicial = leia.nextInt();
		
		System.out.println("Digite a hora final do jogo");
		int horaFinal = leia.nextInt();
	   
		int duracao;
		
		if(horaInicial>horaFinal) {
			duracao = horaFinal - horaInicial;
			
		}
		else {
			duracao = 24 - horaInicial / horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
		
		
		leia.close();

	}

}
