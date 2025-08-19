package classesGenericas;

import java.util.Map;
import java.util.Set;

public class Main2 {

	
	
	public static void main(String[] args) {
		// Criando um objeto Produto<Pao> representando um pão
		int x = 10;
		
		
	}
}

class Produto1<T> {
	private T item;
	private int quantidade;

	public Produto1(T item, int quantidade) {
		this.item = item;
		this.quantidade = quantidade;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorEmEstoqueDeProduto(double valorDoProduto, int quantidadeDeProdtoEmEstoque) {
		
		double total = valorDoProduto * quantidadeDeProdtoEmEstoque;
		return  total;
		
	}
	
	@Override
	public String toString() {
		return "Produto{" + "item=" + item + ", quantidade=" + quantidade + '}';
	}
	
	
}

class Pao {
	private String nome;
	private String tipo;
	private double preco;

	public Pao(String nome, String tipo, double preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}
	
	
	
	public double getPreco() {
		return this.preco;
		
	}
	
	@Override
	public String toString() {
		return "Pao{" + "nome='" + nome + '\'' + ", tipo='" + tipo + '\'' + ", preco=" + preco + '}';
	}

}
