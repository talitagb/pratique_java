package application;

import java.util.Scanner;

public class SomaDeMatrizes {

	public static void main(String[] args) {
		// Programa que faz a soma de duas matrizes e resulta numa terceira matriz

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Integer[][] matA = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matA[i][j] = sc.nextInt();
			}
		}

		Integer[][] matB = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matB[i][j] = sc.nextInt();
			}
		}

		Integer[][] matC = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}

		System.out.println("Matriz resultante: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
