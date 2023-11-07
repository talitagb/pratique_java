package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return preco*quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;		
	}
	
	public String toString() {
		return  nome
				+ ", R$ "
				+ String.format("%.2f", preco) //o String.format basicamente permite você formatar, nesse caso foi usado para deixar o preco com 2 casa decimais
				+ ", "
				+ quantidade 
				+ " units, Total: R$ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}
