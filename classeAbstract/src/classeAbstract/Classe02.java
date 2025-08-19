package classeAbstract;

public class Classe02 extends Classe01{
	
	@Override
	public int getSaldo() {
		return super.getSaldo();
	}
	@Override
	public void setSaldo(int saldo) {
		super.setSaldo(saldo);
	}

	String opa;
	
	public static void main(String[] args) {

		Classe02 c2 = new Classe02();
		c2.setSaldo(1000);
		
		Classe01 x = new Classe02();
	
		x.setSaldo(50);
	
		
		System.out.println();
	}
}
