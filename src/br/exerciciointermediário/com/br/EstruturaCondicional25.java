package br.exerciciointermediário.com.br;

import java.util.Scanner;

public class EstruturaCondicional25 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Digite o codigo do usuario");
		int codigo = leia.nextInt();
		
		
		int senha = 0;
		
		
		if(codigo!=1234) {
			System.out.println("Usuário inválido!");
			
		}
		else if(codigo == 1234) {
			System.out.println("Acesso permitido ");
			System.out.println("Digite a senha do usuario ");
			senha = leia.nextInt();
			if(senha==9999) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Senha invalida");
			}
		}
		
		
		
		
		
		
     leia.close();
	}

}
