package ordenaçao;

public class ContaCorrente implements Comparable<ContaCorrente> {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int compareTo(ContaCorrente o) {

		if (this.saldo > o.saldo) {
			return 1;
		}
		if (this.saldo < o.saldo) {
			return -1;

		}

		return 0;
	}

}
