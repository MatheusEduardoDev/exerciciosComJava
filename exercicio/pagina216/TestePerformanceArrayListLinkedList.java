package exercicio.pagina216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestePerformanceArrayListLinkedList {

	public static void main(String[] args) {

		List<Integer> teste = new LinkedList<Integer>();

		System.out.println("iniciando...");
		
		long inicio = System.currentTimeMillis();

		int tempo = 100000;
		
		for (int i = 0; i < tempo; i++) {

			teste.add(i);
		}
		for (int i = 0; i < teste.size(); i++) {
			teste.get(i);
		}
		

		long fim = System.currentTimeMillis();

		double totalTempo = fim - inicio;

		System.out.println(totalTempo);

	}

}
