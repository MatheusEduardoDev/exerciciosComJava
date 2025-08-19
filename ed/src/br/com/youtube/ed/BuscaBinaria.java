package br.com.youtube.ed;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {
		int vetor[] =  new int [1000000];
		Scanner leitor = new Scanner(System.in);
		
	
		for (int i = 0; i < vetor.length; i++) {
			vetor [i] = i * 2;
		}
		
		System.out.println("qual numero voce busca ?");
		int buscado = leitor.nextInt();
		
		int contador = 0;
		boolean achou = false;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		while (inicio <= fim) {
			meio = (inicio + fim) /2;
			contador ++;
			if (vetor[meio] == buscado) {
				achou = true;
				break;
			}else if(vetor[meio] < buscado) {
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		System.out.println("quantidade de testes " + contador);
		if (achou == true) {
			System.out.println("achou !!!");
		}else {
			System.out.println("nao achou !!!");
		}
	}
	
}
