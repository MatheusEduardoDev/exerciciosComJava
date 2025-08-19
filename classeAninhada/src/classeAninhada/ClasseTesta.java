package classeAninhada;

import classeAninhada.ClasseA.ClasseB;

public class ClasseTesta {

	public static void main(String[] args) {

		ClasseA ca = new ClasseA();

		ClasseA.ClasseB cb = ca.new ClasseB();

		System.out.println("classe testa");
		cb.main(args);

	}
}
