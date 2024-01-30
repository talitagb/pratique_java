package exerciciospoo.application;


import java.util.Locale;
import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		/* Exemplo de como resolver um problema sem a orientação a objetos
		 * Este programa lê as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostra o valor das áreas dos dois
		 * triângulos e diz qual dos dois triângulos possui a maior área.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Insira as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();

		System.out.println("Insira as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();

		double p = (xA + xB + xC) / 2.00;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.00;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
