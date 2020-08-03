package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o ano atual ");
		int anoAtual = leia.nextInt();
		
		System.out.println("Digite o ano do seu nascimento");
		int anoNascimento = leia.nextInt();
		
		int soma = anoAtual - anoNascimento;
		
		if(soma<18) {
			System.out.println("a sua idade = " + soma);
			System.out.println("não podera votar este ano de " + anoAtual);
			
		}
		else if(soma>=18) {
			System.out.println("a sua idade = " + soma);
			System.out.println("podera votar este ano " + anoAtual);
			
		}
		
		leia.close();

	}

}
