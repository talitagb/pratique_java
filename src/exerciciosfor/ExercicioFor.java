package exerciciosfor;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		// Este programa é um exemplo de como funciona a estrutura for, ele lê um número
		// inteiro e depois repete o programa quantas vezes foi informado, e soma os
		// números que foram lidos
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de vezes que você quer que o programa repita:");
		int n = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < n; i++) {
			n = sc.nextInt();
			soma += n;
		}
		System.out.println("A soma dos valores é = " + soma);
		sc.close();
	}

}
