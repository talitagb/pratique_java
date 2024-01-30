package exercicioswhile;

import java.util.Scanner;

public class ExercicioSenha {

	public static void main(String[] args) {
		//Programa que repete a leitura da senha até que ela estja correta
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha numérica:");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida, digite novamente");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		

		sc.close();
	}

}
