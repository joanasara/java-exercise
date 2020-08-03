package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas no mes");
		int horasMes = leia.nextInt();
	    
		System.out.println("digite o salario por hora trabalhada");
		double valorHora = leia.nextDouble();
		
		int calcHora = horasMes / 4;
		double calcValor = 0;
		double salarioTotal = 0;;
		
		if(calcHora>40) {

			System.out.println("As horas trabalhadas na semana = " + calcHora);
			System.out.println("Você tirou hora extra");
			calcValor = (valorHora * 50)/100;
			System.out.printf("o valor hora  com hora extra = %.2f", calcValor);
			System.out.println("");
			salarioTotal = calcValor * horasMes;
			System.out.printf("O salario total do fucionario = %.2f", salarioTotal);
			
		}
		else if(calcHora<=40) {
			
			System.out.println(" horas trabalhadas na semana = " + calcHora);
			System.out.println("Você não tirou hora extra ");
			salarioTotal = valorHora * horasMes;
			System.out.printf("Salario do mes = %.2f", salarioTotal);
			
			
		}
		
		
		
		
		
		leia.close();

	}

}
