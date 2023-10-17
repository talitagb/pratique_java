package exerciciosestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativoPositivo {

	public static void main(String[] args) {
		//Este programa lê um número inteiro, e depois diz se ele é negativo ou não;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}

}
