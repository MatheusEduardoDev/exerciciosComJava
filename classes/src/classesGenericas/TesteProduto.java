package classesGenericas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteProduto<T>{

	public static void main(String[] args) {

		Produto<String> pao = new Produto<String>("Amantegado", 2 , 7.90);
		
		System.out.println(pao.toString());
		pao.totalAPagar();
		
		
		
		Set<String> lista = new HashSet<>();
		
		Iterator<String> i = lista.iterator();
	}

}
