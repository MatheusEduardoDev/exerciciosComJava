package br.com.youtube.ed;

public class ProgramaClientes {
	public static void main(String[] args) {
	
		ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
		
		clientes.adicionar(new Cliente("123", "joao"));
		clientes.adicionar(new Cliente("124", "juca"));
		clientes.adicionar(new Cliente("125", "ze"));

		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println(clientes.get(i).getValor());
		}
		
	}
		
		
}
