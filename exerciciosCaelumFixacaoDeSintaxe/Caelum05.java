package exerciciosCaelumFixacaoDeSintaxe;

import java.util.Scanner;

public class Caelum05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// fatorial valores altos de um numero n
		long n = sc.nextLong();
		long x = 0;

		while (n >= 0) {
			if (x == 0) {
				x = n;
			}
			if (n == 0 && x == 0) {
				n++;
				System.out.println(n);
				break;
			}

			n--;
			if (n == 0) {
				System.out.println(x);
				break;
			}
			x *= n;
		}

	}

}
