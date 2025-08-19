package br.com.youtube.ed;

import java.util.ArrayList;

public class Comparacao {
	public static void main(String[] args) {

		ListaLigada<Integer> lista = new ListaLigada<Integer>();

		ArrayList<Integer> vetor = new ArrayList<Integer>();

		int limite = 1000000;
		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		for (int i = 0; i < limite; i++) {
			vetor.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.print("adicionou " + limite + " elementos no vetor ");
		System.out.println(tempoFinal - tempoInicial);

		int limite2 = 1000000;
		long tempoInicial2 = System.currentTimeMillis();
		long tempoFinal2;
		for (int i = 0; i < limite; i++) {
			lista.adicionar(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.print("adicionou " + limite + " elementos na lista generica ");
		System.out.println(tempoFinal - tempoInicial);

		// ler valores

		long i1 = System.currentTimeMillis();

		for (int i = 0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		long f1 = System.currentTimeMillis();
		long tempo1 = f1 - i1;
		System.out.println("tempo vetor " + tempo1);

		long i2 = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            	iterator.getProximo();
        	
        }
		long f2 = System.currentTimeMillis();
		long tempo2 = f1 - i1;
		System.out.println("tempo lista " + tempo1);

	}

}
