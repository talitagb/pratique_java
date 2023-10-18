package exerciciosestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioParImpar {

	public static void main(String[] args) {
		//Este programa lê um número inteiro e diz se ele é par ou ímpar.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Ímpar");
		}

		sc.close();
	}

}
