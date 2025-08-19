package br.com.youtube.ed;

public class HeapSort {
	public static void main(String[] args) {

		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}

		System.out.println("Desordenado...");
	    for (int i = 0; i < vetor.length; i++) 
			System.out.print(vetor[i] + " ");
		
	
	    //HEAP SORT
	    int n = vetor.length;
	    
	    for (int i = n / 2 - 1; i >= 0; i--) {
			aplicarHeap(vetor, n ,i);
		}
	    
	    System.out.println("Ordenado...");
	    for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	    
	}

	private static void aplicarHeap(int[] vetor, int n , int i) {
		int raiz = i;
		int esquerda = 2 * i + 1;
		int direita =  2 * i + 2;
		
		if (esquerda< n && vetor[esquerda] > vetor[raiz]) {
			
		}
		
		
		
	}
	
}


