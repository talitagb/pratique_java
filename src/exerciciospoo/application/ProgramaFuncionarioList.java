package exerciciospoo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FuncionarioList;

public class ProgramaFuncionarioList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<FuncionarioList> list = new ArrayList<>();

		// PARTE 1 - Lendo dados:

		System.out.print("Quantos funcionários você quer registrar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Esse ID já possui, tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			list.add(new FuncionarioList(id, nome, salario));
		}

		// PARTE 2 - Atualizando o salário de determinado empregado:

		System.out.println();
		System.out.print("Indique o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		FuncionarioList func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Este id não existe!");
		} else {
			System.out.print("Indique a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.incremento(porcentagem);
		}

		// PARTE 3 - Listando funcionários:

		System.out.println();
		System.out.println("Lista de funconários:");
		for (FuncionarioList obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean hasId(List<FuncionarioList> list, int id) {
		FuncionarioList func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
