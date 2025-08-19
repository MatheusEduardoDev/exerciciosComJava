package exercicio.pagina216;

import java.util.ArrayList;
import java.util.Collections;

public class DecrescenteArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
	
		int x = 1000;
		
		for (int i = 1; i <= x; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		
		for (int n : lista) {
			System.out.println(n);
		}
		
	}

	
	
}


