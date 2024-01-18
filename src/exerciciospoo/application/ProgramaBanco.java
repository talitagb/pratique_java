package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		/*
		 * Este programa simples que simula uma conta no banco, podendo depositar um depósito inicial ou não,
		 * depositar uma quantia e sacar uma quantia.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Insira o número da conta: ");
		int numeroConta = sc.nextInt();	
		System.out.println("Insira o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Há um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.println("Insira o deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta (numeroConta, titular, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta, titular);
		}
		
		System.out.println(conta);
		System.out.println();
		System.out.println("Insira um valor para deposito: ");
		double quantia = sc.nextDouble();
		conta.deposito(quantia);
		System.out.println("Conta Atualizada :" + conta);
		System.out.println();
		System.out.println("Insira um valor para saque: ");
		quantia = sc.nextDouble();
		conta.saque(quantia);
		System.out.println("Conta Atualizada :" + conta);
		
		
		sc.close();
	}

}
