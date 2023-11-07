package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class ProgramaTriangulo {

	public static void main(String[] args) {
		/*
		 * Essa é uma forma de resolver o problema do triângulo usando uma classe
		 * separada, com os atributos do triângulo e usando um método dentro dessa
		 * classe para calcular a área.
		 * Obtemos o reaproveitamento do código sem a repetição de calcular a área 2x, e delegamos a
		 * responsabilidade da lógica do cálculo para a própria classe triângulo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Insira as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Insira as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triângulo X: %.4f%n", areaX);
		System.out.printf("Triângulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior área é a X");
		} else {
			System.out.println("A maior área é a Y");
		}
		sc.close();
	}

}
