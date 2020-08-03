package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite quantos Kg de maçã");
		int maca = leia.nextInt();

		System.out.println("Digite quantos Kg dde morango");
		int morango = leia.nextInt();

		double totalMaca = 0;
		double totalMorango = 0;
		double totalPagar = 0;
		double desconto = 0;
		double descontoTotal = 0;

		if (maca <= 5 && morango <= 5) {
			System.out.println(morango + " Kg de morango");
			totalMorango = morango * 2.50;
			System.out.printf("O preço total dos morango = %.2f ", totalMorango);
			System.out.println("");
			System.out.println(maca + " Kg de maçã");
			totalMaca = maca * 1.80;
			System.out.printf("O preço total de maçã = %.2f ", totalMaca);
			System.out.println("");
			totalPagar = totalMorango + totalMaca;
			System.out.printf("O total a pagar = %.2f ", totalPagar);
			System.out.println(" ");
			if (totalPagar > 25) {
				desconto = (10 * totalPagar) / 100;
				descontoTotal = totalPagar - desconto;
				System.out.printf("O valor total a pagar com desconto = %.2f ", descontoTotal);
			}

		} else if (maca > 5 && morango > 5) {
			System.out.println(morango + " Kg de morango");
			totalMorango = morango * 2.20;
			System.out.printf("O preço total dos morango = %.2f ", totalMorango);
			System.out.println(" ");
			System.out.println(maca + " Kg de maçã");
			totalMaca = maca * 1.50;
			System.out.printf("O preço total de maçã = %.2f ", totalMaca);
			System.out.println("");
			totalPagar = totalMorango + totalMaca;
			System.out.printf("O total a pagar = %.2f ", totalPagar);
			System.out.println(" ");
			if (totalPagar > 25) {
				desconto = (10 * totalPagar) / 100;
				descontoTotal = totalPagar - desconto;
				System.out.printf("O valor total a pagar com desconto = %.2f ", descontoTotal);
			}

		} else if (maca > 5 && morango <= 5) {
			System.out.println(morango + " Kg de morango");
			totalMorango = morango * 2.50;
			System.out.printf("O preço total dos morango = %.2f ", totalMorango);
			System.out.println(" ");
			System.out.println(maca + " Kg de maçã");
			totalMaca = maca * 1.50;
			System.out.printf("O preço total de maçã = %.2f ", totalMaca);
			System.out.println("");
			totalPagar = totalMorango + totalMaca;
			System.out.printf("O total a pagar = %.2f ", totalPagar);
			System.out.println(" ");
			if (totalPagar > 25) {
				desconto = (10 * totalPagar) / 100;
				descontoTotal = totalPagar - desconto;
				System.out.printf("O valor total a pagar com desconto = %.2f ", descontoTotal);
			}

		} else if (maca <= 5 && morango > 5) {
			System.out.println(morango + " Kg de morango");
			totalMorango = morango * 2.20;
			System.out.printf("O preço total dos morango = %.2f ", totalMorango);
			System.out.println(" ");
			System.out.println(maca + " Kg de maçã");
			totalMaca = maca * 1.80;
			System.out.printf("O preço total de maçã = %.2f ", totalMaca);
			System.out.println("");
			totalPagar = totalMorango + totalMaca;
			System.out.printf("O total a pagar = %.2f ", totalPagar);
			System.out.println(" ");
			if (totalPagar > 25) {
				desconto = (10 * totalPagar) / 100;
				descontoTotal = totalPagar - desconto;
				System.out.printf("O valor total a pagar com desconto = %.2f ", descontoTotal);
			}

		}

		leia.close();
	}

}
