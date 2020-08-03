package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaSelecao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = leia.nextInt();
		
		if(valor>10) {
			System.out.println("E MAIOR QUE 10");
			
		}else {
			System.out.println("NÃO É MAIOR QUE 10");
			
		}
		
		
		
		
		
        leia.close();
	}

}
