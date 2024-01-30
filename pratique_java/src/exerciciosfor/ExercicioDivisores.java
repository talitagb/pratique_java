package exerciciosfor;

import java.util.Scanner;

public class ExercicioDivisores {

	public static void main(String[] args) {
		//Este programa lê um número inteiro N e calcular todos os seus divisores
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
