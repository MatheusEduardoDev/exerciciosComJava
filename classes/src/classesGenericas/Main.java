package classesGenericas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		// Criando uma lista de Strings
		List<String> listaDeStrings = new ArrayList<>();
		listaDeStrings.add("Olá");
		listaDeStrings.add("Mundo");

		// Criando uma lista de Integers
		List<Integer> listaDeIntegers = new ArrayList<>();
		listaDeIntegers.add(1);
		listaDeIntegers.add(2);

		// Chamando o método para imprimir qualquer lista
		imprimirLista(listaDeStrings);
		imprimirLista(listaDeIntegers);

		HashSet<Integer> x = new HashSet<Integer>();

		
		x.contains(x);
		
	}

	// Método genérico para imprimir qualquer tipo de lista
	public static <T> void imprimirLista(List<T> lista) {
		for (T elemento : lista) {
			System.out.println(elemento);
		}
	}
}
