package br.exerciciointermediário.com.br;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o numero da conta do cliente");
		int numeroContaCliente = leia.nextInt();
		
		System.out.println("Digite o saldo do clinte");
		double saldo = leia.nextDouble();
		
		
		System.out.println("Digite o debito do clinte ");
		double debito  = leia.nextDouble();
		
		
		System.out.println("Digite o credito do cliente");
		double credito = leia.nextDouble();
		
		double saldoAtual;
		
		saldoAtual = saldo - debito + credito;
		
		if(saldoAtual>=0) {
			System.out.println("numero da conta " + numeroContaCliente);
			System.out.println("SALDO POSITIVO ");
			
		}else {
			System.out.println("numero da conta " + numeroContaCliente);
			System.out.println("SALDO NEGATIVO");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
