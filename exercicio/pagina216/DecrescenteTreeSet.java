package exercicio.pagina216;

import java.util.Set;
import java.util.TreeSet;

public class DecrescenteTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		

		int x =  1000;
		
		for (int i = 1; i <= x ; i++) {
			ts.add(i);
		}
		
		TreeSet<Integer> decrecente = (TreeSet<Integer>) ts.descendingSet();
		
		
		for (int numero : decrecente) {
			System.out.println(numero);
			
		}
	}
	
}
