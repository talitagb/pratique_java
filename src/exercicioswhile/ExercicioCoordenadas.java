package exercicioswhile;

import java.util.Scanner;

public class ExercicioCoordenadas {

	public static void main(String[] args) {
		/*
		 * Esse programa lê as coordenadas (X,Y) de uma quantidade indeterminada de
		 * pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele
		 * pertence. O algoritmo será encerrado quando pelo menos uma de duas
		 * coordenadas for NULA
		 */

		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("Digite as coordenadas X e Y:");
		x = sc.nextDouble();
		y = sc.nextDouble();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else {
				System.out.println("Quarto quadrante");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}

		System.out.println("Alguma das coordenadas foram nulas");
		sc.close();
	}

}
