package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAlturas {

	public static void main(String[] args) {
		/*
		 * Este programa lê o nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média das pessoas,
		 * e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da pessoa %d %n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		double soma = 0;
		int contador = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				contador++;
			}
			soma += alturas[i];
		}
		double media = soma / n;
		double porcentagem = ((double) contador / n) * 100;

		System.out.printf("Altura média: %.2f%n", media);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
				;
			}
		}

		sc.close();
	}

}
