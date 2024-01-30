package exercicios;

import java.util.Scanner;

//Aplicação simples de menu imitando operações de um banco
public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nome = "Talita Gonçalves";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("****************************************");
        System.out.println("Dados inicias do cliente:");
        System.out.println("\nNome:            " + nome);
        System.out.println("Tipo conta:        " + conta);
        System.out.println("Saldo inicial:  R$ " + saldo);
        System.out.println("****************************************");

        String menu = """
                
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;


        while(opcao != 4){
            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Saldo atual R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja transferir? ");
                    double valor = sc.nextDouble();

                    if (valor > saldo){
                        System.out.println("O valor da transferência é maior que o saldo");
                    }else{
                        saldo -= valor;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual valor deseja depositar? ");
                    double valorDeposito = sc.nextDouble();

                    saldo += valorDeposito;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Operações encerradas");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        sc.close();
    }
}
