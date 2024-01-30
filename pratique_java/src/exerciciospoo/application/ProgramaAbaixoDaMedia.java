package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAbaixoDaMedia {

	public static void main(String[] args) {
		/*
		 * Este programa lê um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostra na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostra todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double media = soma / n;

		System.out.printf("Média do vetor= %.3f%n", media);
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();
	}

}
