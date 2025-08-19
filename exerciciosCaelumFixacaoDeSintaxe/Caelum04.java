package exerciciosCaelumFixacaoDeSintaxe;

import java.util.Scanner;
import java.util.Locale;

public class Caelum04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//fatorial de um numero n
		int n = sc.nextInt();
		int x = 0;

		while (n >= 0) {
			if (x == 0) {
				x = n;
			}
				if(n == 0 && x == 0) {
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
