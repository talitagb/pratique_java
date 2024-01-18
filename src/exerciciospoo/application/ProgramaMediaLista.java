package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaMediaLista {

	public static void main(String[] args) {
		// Praticando as listas criei esse programa básico que solicita ao usuário que insira uma lista de números.
		// Calcule e imprima a média dos números na lista.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Double> list = new ArrayList<>();

		System.out.println("Quantos números vai inserir na lista: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "º número");
			double numero = sc.nextDouble();
			list.add(numero);
		}

		double soma = 0.0;

		for (double numero : list) {
			soma += numero;
		}

		double media = soma / n;

		System.out.println("A média dos números da lista é: " + media);

		sc.close();
	}

}
