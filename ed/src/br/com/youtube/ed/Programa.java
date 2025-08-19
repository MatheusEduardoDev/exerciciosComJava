package br.com.youtube.ed;

public class Programa {

	public static void main(String[] args) {
		//new metodo construtor
		ListaLigada lista = new ListaLigada();

		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("TAMANHO: " + lista.getTamanho());
		System.out.println("primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("ultimo: " + lista.getUltimo().getValor());
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("removeu estado DF");
		lista.adicionar("SP");
		System.out.println("add estado SP");
		lista.remover("AC"); 
		lista.remover("BA");
		lista.remover("CE");
		
		for (int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
	}
}
