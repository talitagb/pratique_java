package exerciciosestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioLanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, qntd;

		System.out.println("Digite o código da comida e a quantidade: ");

		codigo = sc.nextInt();
		qntd = sc.nextInt();

		double valor;

		if (codigo == 1) {
			valor = qntd * 4.00;
		} else if (codigo == 2) {
			valor = qntd * 4.50;
		} else if (codigo == 3) {
			valor = qntd * 5.00;
		} else if (codigo == 4) {
			valor = qntd * 2.00;
		} else {
			valor = qntd * 1.50;
		}

		System.out.printf("Total a pagar: R$ %.2f%n", valor);

		sc.close();
	}

}

/*Com base na tabelinha, este programa lê o código de um item e a quantidade deste item. Depois ele
calcula e mostra o valor da conta a pagar

Código    Lanche            Valor
1       Cachorro Quente 	 R$ 4.00
2	     X-Salada			 R$ 4.50
3		 X-Bacon			 R$ 5.00
4		 Torrada			 R$ 2.00
5		 Refrigerante		 R$ 1.50
*/
