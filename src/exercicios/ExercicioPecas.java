package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, num1, num2;
		double valor1, valor2, total;
		
		System.out.println("Digite o código de uma peça1, número de peças1 e o valor unitário de cada peça1");
				
		peca1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o código de uma peça2, número de peças2 e o valor unitário de cada peça2");
		
		peca2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = num1 * valor1 + num2 * valor2;
		
		System.out.println("Código das peças: " + peca1 +" e "+ peca2);
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();

	}

}
