package br.com.youtube.ed;

import java.util.Scanner;

public class BuscaLinear {

	public static void main(String[] args) {
		int [] vetor = new int [10];
		
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
			System.out.println(vetor[i]);
		}
		System.out.println("qual número vc busca ??");
		Scanner leitor = new Scanner(System.in);
		int buscado = leitor.nextInt();
		
		boolean achou  = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == buscado) {
				achou = true;
				break;
			}
		}
		
		if (achou ==  true) {
			System.out.println("achou !!!");
		}else {
			System.out.println("nao achou !!!");
		}
		
	}
}
