package exercicio.pagina216;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Properties;

public class TestaPerformanceArrayListHashSet {

	public static void main(String[] args) {

		System.out.println("iniciando...");
		long inicio = System.currentTimeMillis();

		Collection<Integer> teste = new HashSet<Integer>();

		int total = 100000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();

		long tempo = fim - inicio;
		System.out.println("tempo gasto: " + tempo);
		
		
		Collection<Integer> teste2 = new ArrayList<Integer>();

		
		
	}

}
