package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// soma Fibonacci com duas variaveis
		int antes = 0;
		int depois = 1;

		System.out.print(antes + " " + depois + " ");

		while (depois <= 100) {
			antes += depois;
			System.out.print(antes + " ");
			depois += antes;
			if (depois > 100) {
				break;
			}
			System.out.print(depois + " ");

		}

	}

}
