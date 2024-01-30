package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaNegativos {

	public static void main(String[] args) {
		// Este programa lê um número inteiro n e depois n números inteiros e
		// armazena-os em um vetor. Depois mostra na tela os números negativos lidos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("Numeros Negativos: ");

		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();
	}

}
