package exerciciosCaelumFixacaoDeSintaxe;

import java.util.Scanner;
import java.util.Locale;

public class Caelum07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = 0;
		int volta = 0;

		while (y != 1) {
			if (y == 0) {
				if (x % 2 == 0) {
					y = x / 2;
					System.out.println(y);
				}
				if (x % 2 != 0) {
					y = 3 * x + 1;
					System.out.println(y);
				}
			}
					
			if(y > 0) {
				if (y % 2 == 0 && y != 1) {
					y = y / 2;
					System.out.println(y);
				}
				if (y % 2 != 0 && y != 1) {
					y = 3 * y + 1;
					System.out.println(y);
				}
				
				
			}

			
		}

	}

}
