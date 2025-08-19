package exerciciosCaelumFixacaoDeSintaxe;

import java.util.Locale;
import java.util.Scanner;

public class Caelum01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		//imprimir os numeros de 150 a  300
		int x = 150;
		
		while(x <= 300) {
			System.out.println(x);
			x += 1;
		}

		

	}

}
