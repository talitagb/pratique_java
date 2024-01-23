package exercicios;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tentativa = 1;
        int maxTentativas = 5;
        int numero = 0;
        Random gerarNumeroAleatorio = new Random();
        int numeroAleatorio = gerarNumeroAleatorio.nextInt(100);


        while (numero != numeroAleatorio && tentativa <= maxTentativas) {
            System.out.println("Tente adivinhar um número secreto de 0 a 100");
            numero = sc.nextInt();

            if (numero == numeroAleatorio) {
                String palavraTentativa = tentativa > 1 ? " tentativas" : " tentativa";
                System.out.println("Você acertou o número secreto com " + tentativa + palavraTentativa);
            } else {
                if (numero > numeroAleatorio) {
                    System.out.println("O número secreto é menor");
                } else {
                    System.out.println("O número secreto é maior");
                }
                tentativa++;
            }
        }
            if (numero != numeroAleatorio){
                System.out.println("Você excedeu o número máximo de tentativas, o número secreto era " + numeroAleatorio);
            }

        sc.close();
    }
}


