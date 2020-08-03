package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite a quantidade combustivel");
		int litro1 = leia.nextInt();
		
		System.out.println("Digite qual e o combustivel");
		String nome = leia.next();
		
		double soma = 0;
		double litros = 0;
		double total = 0;
		
		if(nome.equalsIgnoreCase("A-álcool") && litro1<=20) {
			soma = litro1 * 2.90; 
			litros = (3 * soma)/100;
			total = soma - litros;
			System.out.println(nome);
			System.out.printf("O valor a ser pago pelo cliente = %.2f", total);
			System.out.println(" ");
		}
		else if(nome.equalsIgnoreCase("A-álcool") && litro1>20) {
			soma = litro1 * 2.90; 
			litros = (5 * soma)/100;
			total = soma - litros;
			System.out.println(nome);
			System.out.printf("O valor a ser pago pelo cliente = %.2f", soma);
			System.out.println(" ");
			
		}
		else if(nome.equalsIgnoreCase("G-gasolina") && litro1<=20) {
			soma = (litro1 * 3.30); 
			litros = (soma * 4)/100;
			total = soma - litros;
			System.out.println(nome);
			System.out.printf("O valor a ser pago pelo cliente = %.2f", total);
			System.out.println(" ");
			
		}
		else if(nome.equalsIgnoreCase("G-gasolina") && litro1>20) {
			soma = (litro1 * 3.30); 
			litros = (6 * soma)/100;
			total = soma - litros;
			System.out.println(nome);
			System.out.println("O valor total do combustivel sem o desconto = " + soma);
			System.out.printf("O valor a ser pago pelo cliente = %.2f", total);
			System.out.println(" ");
			
			
		}
		
		
		
		
		
		leia.close();

	}

}
