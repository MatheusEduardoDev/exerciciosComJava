package fibonacci;

public class FibonacciComOperadorTernario {

	int antes = 0;
	int depois = 1;
	int fib = 0;
	int loop = 0;

	int Fibonacci(int quant) {

		if (loop >= quant) {
			return 0;
		}

		fib = (depois > antes) ? antes += depois : (depois += antes);

		System.out.print(fib + " ");
		loop++;
		return Fibonacci(quant);
	}
	

	public static void main(String[] args) {
		FibonacciComOperadorTernario x = new FibonacciComOperadorTernario();
		System.out.print(x.antes + " " + x.depois + " ");
		x.Fibonacci(6);

	}

}
class x {
	public static void main(String[] args) {
		FibonacciComOperadorTernario x = new FibonacciComOperadorTernario();
		x.Fibonacci(6);

	}
}