package fibonacci;

public class FibonacciComArrays {

	// atributos
	int antes = 0;
	int depois = 1;
	int array[];

	int fib(int pos) {
		if (antes == 0) {
			this.array = new int[pos];
		}
		if(pos == 0 ) {
			return 0 ;
		}
		System.out.print(antes + " ");
		antes += depois;
		System.out.print(depois + " ");
		depois += antes;
		return 1 + fib(pos - 1);
	}
	
	public static void main (String [] args) {
		FibonacciComArrays x = new FibonacciComArrays ();
		
		x.fib(10);
		
	}
	
	public class Fibonacci025 {

	    public static void main(String[] args) {
	        int n = 10; // Você pode alterar o valor de 'n' para obter mais termos da sequência.
	        
	        System.out.println("Sequência de Fibonacci até o " + n + "-ésimo termo:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(calcularFibonacci(i) + " ");
	        }
	    }

	    public static int calcularFibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            // A chamada recursiva para calcular os termos anteriores.
	            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
	        }
	    }
	}


}
