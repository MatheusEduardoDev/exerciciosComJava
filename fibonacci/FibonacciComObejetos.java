package fibonacci;

import java.util.Scanner;

public class FibonacciComObejetos {

	int antes = 0;
	int depois = 1;
	int x = 1;


	int calculaFibonacci(int quantidade) {
		if(x == 1) {
			System.out.print(antes + " " + depois + " ");
		}
		x++;
		
		antes += depois;
		System.out.print(antes + " ");
		depois += antes;
		//caso base: quando quantidade for == 2 a recursao vai parar de somar 
		if(quantidade == 2) {
			return depois;
		}
		System.out.print(depois + " ");
		//chamada da funçao 
		return calculaFibonacci(quantidade - 2);

	}

	public class testeFibonacci {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			FibonacciComObejetos fibo = new FibonacciComObejetos();

			int i = fibo.calculaFibonacci(6);
			System.out.println(i);

		}
	}
}