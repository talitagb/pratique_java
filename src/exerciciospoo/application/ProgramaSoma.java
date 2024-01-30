package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSoma {

	public static void main(String[] args) {
		/*
		 * Este programa lê N números reais e armazene-os em um vetor. Em seguida: -
		 * Imprime todos os elementos do vetor - Mostra na tela a soma e a média dos
		 * elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		double media = soma / n;

		System.out.print("Valores: ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}

		System.out.println("\nSoma: " + soma);
		System.out.printf("Media: %.2f%n", media);

		sc.close();
	}

}
