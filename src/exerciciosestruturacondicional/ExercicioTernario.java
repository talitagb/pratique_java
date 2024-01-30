package exerciciosestruturacondicional;

import java.util.Scanner;

public class ExercicioTernario {

	public static void main(String[] args) {
		//Este exercício mostra como funciona a estrutura condicional ternária.
		//É uma opção ao if-else quando se deseja decidir um valor com base em uma condição.
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

		sc.close();
	}

}
