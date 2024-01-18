package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramaNotas {

	public static void main(String[] args) {
		/*
		 * Este programa lê o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostra qual a nota final do aluno no ano. Diz
		 * também se o aluno está aprovado (Passou) ou não (Não Passou) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota = 60).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome e as notas do aluno: ");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal() < 60) {
			System.out.println("Não passou!");
			System.out.println("Pontos Faltantes: " + aluno.pontosFaltantes());

		} else {
			System.out.println("Passou!");
		}

		sc.close();

	}

}
