package javaMatriz02;

import java.util.Locale;
import java.util.Scanner;

public class somar2Matriz {
	public static void main(String[] args) {
      Locale.setDefault(Locale.ENGLISH);
      Scanner sc = new Scanner(System.in);
      
      int M = sc.nextInt();
      int N = sc.nextInt();
      int [][] matriz01 = new int [M][N];
      int [][] matriz02 = new int [M][N];
      int [][] soma = new int [M][N];


	   for(int i = 0;i < M; i++) {
		   for(int j = 0; j < N; j++) {
			   matriz01[i][j] = sc.nextInt();
		   }
	   }
	   for(int i = 0;i < M; i++) {
		   for(int j = 0; j < N; j++) {
			   matriz02[i][j] = sc.nextInt();
		   }
	   }
	   for(int i = 0;i < M; i++) {
		   for(int j = 0; j < N; j++) {
			   soma [i][j] = matriz01[i][j]+matriz02[i][j];
			   System.out.print(soma [i][j]+" ");
		   }
	   System.out.println();
	   }
	}
}
