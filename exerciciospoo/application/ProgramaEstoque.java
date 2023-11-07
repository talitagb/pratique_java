package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramaEstoque {

	public static void main(String[] args) {
		/*
		 * Este programa lê os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). 
		 * Em seguida: 
		 * 	• Mostra os dados do produto (nome,preço, quantidade no estoque, valor total no estoque);
		 *  • Realiza uma entrada no estoque e mostra novamente os dados do produto; 
		 *  • Realiza uma saída no estoque e mostra novamente os dados do produto.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Insira dados do produto: ");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.println("Insira o número de produtos a ser adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados atualizados: " + produto);

		System.out.println();
		System.out.println("Insira o número de produtos a ser removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados atualizados: " + produto);

		sc.close();

	}

}
