package br.com.youtube.ed;

public class InsertionSort {
	public static void main(String[] args) {

		int[] vetor = new int[10];

		// preencha o vetor com numeros aleatorios
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		    System.out.println("Desordenado");
			System.out.println(vetor[i]);
		}

		int aux,j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i - 1;
			while (j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}

			vetor[j +1] = aux;
		}
		
		System.out.println("Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
