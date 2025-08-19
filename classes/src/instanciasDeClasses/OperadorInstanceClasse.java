package instanciasDeClasses;

public class OperadorInstanceClasse {

	public static void main(String[] args) {
		
		Funcionario fg = new Gerente();
        Funcionario f = new Funcionario();
		Gerente g = new Gerente();

		
		System.out.println(fg instanceof Funcionario);
		System.out.println(fg instanceof Gerente);
		System.out.println(f instanceof Funcionario);
		System.out.println(f instanceof Gerente);
		System.out.println(g instanceof Funcionario);
		System.out.println(g instanceof Gerente);

		
		
		
		
	}
	
	
}
