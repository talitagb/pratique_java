package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRaio {

	public static void main(String[] args) {
		// Este programa lê o valor do raio do círculo e calcula a área dele
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorRaio, area, pi = 3.14159;

		System.out.println("Qual o valor do raio do círculo?");
		valorRaio = sc.nextDouble();

		area = pi * valorRaio * valorRaio;
		System.out.printf("Área = %.2f%n", area);

		sc.close();

	}

}
