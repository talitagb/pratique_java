package exerciciosestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		//Este programa lê dois números inteiros e mostra se são múltiplos entre si ou não.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois números inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		
		sc.close();
	}

}
