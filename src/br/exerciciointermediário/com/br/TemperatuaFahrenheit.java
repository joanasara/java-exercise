package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class TemperatuaFahrenheit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit");
		double fahrenheit = leia.nextDouble();
		
		double celsius ;
		
		
		 celsius = (fahrenheit - 32)*5 /9;
		
		System.out.printf("O valor graus Celsius = %.1f ", celsius);
		
		
      leia.close();

	}

}
