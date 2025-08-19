package ordenaçao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestaConta {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.setSaldo(2000);

		ContaCorrente c2 = new ContaCorrente();
		c2.setSaldo(1000);

		List<ContaCorrente> lista = new ArrayList<>();
		
		lista.add(c1);
		lista.add(c2);
		
		Collections.sort(lista);
		
		for (ContaCorrente c: lista) {
			System.out.println(c.getSaldo());
		}
		
	}

}
