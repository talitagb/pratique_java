package exerciciosestruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioHoras {

	public static void main(String[] args) {
		// Este programa lê a hora inicial e hora final de um jogo e calcula qual foi a duração dele.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		
		System.out.println("Digite hora inicial e a hora final do jogo: ");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int duracao;
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial; 
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo teve duração de " + duracao + "hora(s)");
		sc.close();
	}

}
