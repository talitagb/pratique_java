package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor1, valor2, soma;

		System.out.println("Insira o primeiro número: ");
		valor1 = sc.nextInt();

		System.out.println("Insira o segundo número: ");
		valor2 = sc.nextInt();

		soma = valor1 + valor2;

		System.out.println("Soma = " + soma);

		sc.close();

	}

}
