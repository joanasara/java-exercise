package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a idade do primeiro homem");
		int idadeh1 = leia.nextInt();

		System.out.println("Digite a idade do segundo homem");
		int idadeh2 = leia.nextInt();

		System.out.println("Digite a idade da primeira mulher");
		int idadem1 = leia.nextInt();

		System.out.println("Digite a idade da segunda mulher");
		int idadem2 = leia.nextInt();
		int soma = 0;
		int soma1 = 0;

		if (idadeh1 == idadeh2 && idadem1 == idadem2) {

		} else if (idadeh1 > idadeh2 && idadem1 < idadem2) {
			System.out.println("A primeira idade e o homem mais velho");
			System.out.println("A primeira idade a mulher e mais nova");
			soma = idadeh1 * idadem1;
			System.out.println("A soma das idade = " + soma);
			System.out.println(" ");
			System.out.println("A segunda idade e o homem mais novo");
			System.out.println("A segunda idade a mulher e mais velha ");
			soma1 = idadeh2 * idadem2;
			System.out.println("A soma da idade = " + soma1);
		} else if (idadeh2 > idadeh1 && idadem2 < idadem1) {
			System.out.println("A segunda idade e o homem mais velho");
			System.out.println("A segunda idade a mulher e mais nova");
			soma = idadeh2 * idadem2;
			System.out.println("A soma das idade = " + soma);
			System.out.println(" ");
			System.out.println("A primeira idade e o homem mais novo");
			System.out.println("A primeira idade a mulher e mais velha ");
			soma1 = idadeh1 * idadem1;
			System.out.println("A soma da idade = " + soma1);

		} else if (idadeh2 > idadeh1 && idadem1 < idadem2) {
			System.out.println("A segunda idade e o homem mais velho");
			System.out.println("A primeira  idade a mulher e mais nova");
			soma = idadeh2 * idadem1;
			System.out.println("A soma das idade = " + soma);
			System.out.println(" ");
			System.out.println("A primeira idade e o homem mais novo");
			System.out.println("A segunda idade a mulher e mais velha ");
			soma1 = idadeh1 * idadem2;
			System.out.println("A soma da idade = " + soma1);
		} else if (idadeh1 > idadeh2 && idadem2 < idadem1) {
			System.out.println("A primeira idade e o homem mais velho");
			System.out.println("A segunda idade a mulher e mais nova");
			soma = idadeh2 * idadem1;
			System.out.println("A soma das idade = " + soma);
			System.out.println(" ");
			System.out.println("A segunda idade e o homem mais novo");
			System.out.println("A primeira idade a mulher e mais velha ");
			soma1 = idadeh2 * idadem1;
			System.out.println("A soma da idade = " + soma1);

		}

		leia.close();

	}

}
