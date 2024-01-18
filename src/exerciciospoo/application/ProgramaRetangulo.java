package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciospoo.entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		/*
		 * Este programa lê os valores da largura e altura de um retângulo. Em
		 * seguida, mostra na tela o valor de sua área, perímetro e diagonal. Usei a classe Retangulo para colocar a lógica.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Insira a largura e altura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();

		System.out.println("Área= " + retangulo.area());
		System.out.println("Perímetro= " + retangulo.perimetro());
		System.out.println("Diagonal= " + retangulo.diagonal());

		sc.close();

	}

}
