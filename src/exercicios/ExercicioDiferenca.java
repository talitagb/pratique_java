package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDiferenca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("Digite 4 números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = a*b - c*d;
		
		System.out.println("Diferença = " + diferenca);
		
		
		sc.close();
	}

}
