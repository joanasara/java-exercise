package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do salario fixo");
		double salario = leia.nextDouble();

		System.out.println("Digite o valor das vendas ");
		int vendas = leia.nextInt();

		double totalVendas = 0;
		double salarioTotal = 0;
		if (vendas <= 1500) {
			totalVendas = (vendas * 3) / 100;
			System.out.println("Comissão das vendas = " + totalVendas);
			salarioTotal = salario + totalVendas;
			System.out.println("O salario total = " + salarioTotal);

		} else if (vendas > 1500) {
			double totalVenda1 = (vendas * 5) / 100;
			salarioTotal = salario + totalVenda1 + totalVendas;
			System.out.println("Sua comisão = " + totalVenda1);
			System.out.println("O salario total = " + salarioTotal);
		}

		leia.close();
	}

}
