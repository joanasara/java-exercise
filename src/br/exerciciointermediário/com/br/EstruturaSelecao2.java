package br.exerciciointermedi�rio.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Escreva a quantidade de ma�as");
		int maca = leia.nextInt();
		double total;
		
		if(maca<12) {
			System.out.println("A quantidade de ma�as = " + maca);
			System.out.println("O valor da ma�a = 1,30");
			total = 1.30 * maca;
			System.out.printf("O valor total das ma�as = %.1f", total);
		}
		else if(maca>=12) {
			System.out.println("A quantidade de ma�as = " + maca);
			System.out.println("O valor da ma�a = 1,00");
			total = 1 * maca;
			System.out.printf("O valor total das ma�as = %.1f", total);
		}
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
