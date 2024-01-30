package exerciciosfor;

import java.util.Scanner;

public class ExercicioNumImpares {

	public static void main(String[] args) {
		//Este programa lê um valor inteiro. Em seguida mostra os ímpares de 1 até X, um valor por linha, inclusive o 
		//X, se for o caso.
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int x = sc.nextInt();
		
		for(int i = 1; i<x; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
