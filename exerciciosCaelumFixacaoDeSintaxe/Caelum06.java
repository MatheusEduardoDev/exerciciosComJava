package exerciciosCaelumFixacaoDeSintaxe;

public class Caelum06 {

	public static void main(String[] args) {
		
		// soma Fibonacci	
		int antes = 0;
		int depois = 1;
        int soma = 0;
		
        System.out.print(antes + " " + depois + " ");
        	
        while(soma <= 100) {
        	soma = antes + depois;
        	System.out.print(soma + " ");
        	antes = depois;
        	depois = soma;
        	
        }     
	}
}
