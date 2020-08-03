package br.exerciciointermediário.com.br;


import java.util.Locale;
import java.util.Scanner;

public class MediaFinalAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno");
		double nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno");
		double nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota do aluno");
		double nota3 = leia.nextDouble();
		
		double mediaFinal;
		
		mediaFinal = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;
		
		System.out.printf("A media final desse aluno = %.1f ", mediaFinal);
		
		
		leia.close();
	}

}
