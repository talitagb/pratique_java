package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		//Para definir localidade
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double a;
		
		x = sc.next();
		y = sc.nextInt();
		a = sc.nextDouble();
		
		System.out.println("Você digitou a string: " + x);	
		System.out.println("Você digitou o número inteiro: " + y);
		System.out.printf("Você digitou o número com ponto flutuante: %.2f%n", a);

		
		sc.close();			

	}

}
