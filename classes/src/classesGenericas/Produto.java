package classesGenericas;

import java.util.HashSet;

public class Produto<T> {
	
	

	private T item;
	private int quantidade;
	private double preco;

	public Produto(T item, int quantidade, double preco) {
		this.item = item;
		this.quantidade = quantidade;
		this.preco = preco;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto{" + "item = " + item + ", quantidade = " + quantidade + ", preco = " + preco + '}';
	}
	
	public void totalAPagar() {
		System.out.println("Total = " + this.quantidade * this.preco);
	}
	
	

}
