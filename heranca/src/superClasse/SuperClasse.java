package superClasse;

public class SuperClasse {
	
	void comportamento () {
		System.out.println("comportamento Pai");
	}
	
	void referencia (SuperClasse s) {
		s.comportamento();
	}

}
