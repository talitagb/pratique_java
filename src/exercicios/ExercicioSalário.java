package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalário {

	public static void main(String[] args) {
		/*
		 * Este programa lê o número de um funcionário, seu número de horas trabalhadas, o
		 * valor que recebe por hora e calcula o salário desse funcionário. Depois,
		 * mostra o número e o salário do funcionário.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;

		System.out.println("Digite o número do funcionário, horas trabalhadas e valor que recebe por hora: ");
		numFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorPorHora;

		System.out.println("Número Funcionário = " + numFuncionario);
		System.out.printf("Salário = R$ %.2f", salario);

		sc.close();
	}

}
