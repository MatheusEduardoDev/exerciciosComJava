package javaMatrizFila;

import java.util.Locale;
import java.util.Scanner;

public class matrizFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		// Lendo o número de filas e a quantidade de soldados por fila
		int M = sc.nextInt(); // Número de filas
		int N = sc.nextInt(); // Soldados por fila

		int[][] pelotao = new int[M][N];

		// Lendo a formação do pelotão
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				pelotao[i][j] = sc.nextInt();
			}
		}

		// Lendo o número da fila a ser girada
		int filaGirar = sc.nextInt();

		// Girar a fila escolhida
		int[] filaEscolhida = pelotao[filaGirar - 1]; // Ajuste do índice
		int ultimoSoldado = filaEscolhida[N - 1];

		for (int i = N - 1; i > 0; i--) {
			filaEscolhida[i] = filaEscolhida[i - 1];
		}
		filaEscolhida[0] = ultimoSoldado;

		// Exibindo a formação atualizada do pelotão
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(pelotao[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
