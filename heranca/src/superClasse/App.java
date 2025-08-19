package superClasse;

class App {

	
	public static void main(String[] args) {
		
	
		SubClasse s1 = new SubClasse();
		s1.referencia(s1);
		
		SubClasse2 s2 = new SubClasse2();
		s2.referencia(s2);
		
		SubClasse3 s3 = new SubClasse3();
        s3.referencia(s3);

	
	}

}
