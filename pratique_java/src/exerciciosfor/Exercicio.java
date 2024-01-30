package exerciciosfor;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 Este program lê um valor inteiro n. Este valor será a quantidade de valores inteiros X
		 que serão lidos em seguida. Mostra quantos destes valores X estão dentro do
		 intervalo [10,20] e quantos estão fora do intervalo.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro:");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
