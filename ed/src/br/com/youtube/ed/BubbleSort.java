package br.com.youtube.ed;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}

		// BUBBLR SORT
		int troca;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 1 + i; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					troca = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = troca;

				}
			}
		}

		System.out.println();
		System.out.println("agora tudo esta em ordem...");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}

}
