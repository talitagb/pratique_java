package exerciciospoo.application;

import java.util.Scanner;

public class ProgramaSomaVetores {

	public static void main(String[] args) {
		/*
		 * Este programa lê dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gera um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprime o vetor C gerado.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();

		int[] vetorA = new int[n];
		int[] vetorB = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}

		int[] vetorC = new int[n];
		for (int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		System.out.println("Vetor Resultante:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", vetorC[i]);
		}
		sc.close();
	}

}
