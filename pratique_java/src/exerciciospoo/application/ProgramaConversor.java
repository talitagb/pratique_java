package exerciciospoo.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciospoo.entities.ConversorDeMoeda;

public class ProgramaConversor {

	public static void main(String[] args) {
		/*
		 * Este programa lê a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o preço do dólar agora? ");
		double dolar = sc.nextDouble();

		System.out.println("Quantos dólares você quer comprar? ");
		double reais = sc.nextDouble();

		System.out.printf("Valor a ser pago em reais: R$ %.2f", ConversorDeMoeda.dolarParaReal(dolar, reais));

		sc.close();
	}

}
