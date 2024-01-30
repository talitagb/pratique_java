
package exerciciospoo.entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	// Como forma de melhoria foi inserido esse construtor pra obrigar a iniciar os
	// valores

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	// Criado os getters e setters para acessar e modificar os dados

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) // o String.format basicamente permite você formatar, nesse
																// caso foi usado para deixar o preco com 2 casa
																// decimais
				+ ", " + quantidade + " units, Total: R$ " + String.format("%.2f", valorTotalEmEstoque());
	}
}
