package classeAninhada;

import classeAninhada.ClasseA.ClasseB;

public class ClasseA {
	
	class ClasseB{
	
		public static void main(String[] args) {
	
			System.out.println(0b111);
			
		}
	}
	
	
    public static void main(String[] args) {
		ClasseA ca = new ClasseA();
		
		ClasseB cb = ca.new ClasseB();
		
		cb.main(args);
	}
}
