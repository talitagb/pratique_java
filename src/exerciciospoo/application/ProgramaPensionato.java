package application;

import java.util.Scanner;

import entities.Aluguel;

public class ProgramaPensionato {

	public static void main(String[] args) {
		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos números 0 a 9.
		 * Este programa inicia com todos os dez quartos vazios, e depois leia uma quantidade N representando o
		 * número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em
		 * seguida, registra o aluguel dos N estudantes. Para cada registro de aluguel,
		 * informar o nome e email do estudante, bem como qual dos quartos ele escolheu
		 * (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa
		 * deve imprimir um relatório de todas ocupações do pensionato, por ordem de
		 * quarto.
		 */
		Scanner sc = new Scanner(System.in);

		Aluguel[] vetor = new Aluguel[10];

		System.out.println("Quantos quartos você quer alugar?");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.printf("Aluguel %d%n", i + 1);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");

		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();
	}

}
