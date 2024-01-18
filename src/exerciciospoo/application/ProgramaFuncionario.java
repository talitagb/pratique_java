package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();

		System.out.println("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.println("Qual a porcentagem a aumentar no salário?");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + funcionario);
		
		
		sc.close();
	}

}
