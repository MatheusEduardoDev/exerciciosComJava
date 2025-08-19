package javaMatriz03Maior;

import java.util.Locale;
import java.util.Scanner;

public class matrizMaior03 {
	public class somar2Matriz {
		public static void main(String[] args) {
			Locale.setDefault(Locale.ENGLISH);
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[][] matriz = new int[N][N];
			int maior = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (matriz[i][j] > maior) {
						maior = matriz[i][j];
					}
				}
				System.out.println(maior);
				maior = 0;

			}
		}

	}

}
