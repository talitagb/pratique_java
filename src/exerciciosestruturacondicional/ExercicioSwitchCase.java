package exerciciosestruturacondicional;

import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {
		/*Estrutura condicional switch-case, funciona bem quando não se quer usar
		 vários if-else*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro para saber o dia da semana:");
		int x = sc.nextInt();

		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}

		System.out.println("Dia da semana é " + dia);

		sc.close();
	}

}
