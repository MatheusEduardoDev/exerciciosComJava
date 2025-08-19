package exercicio.pagina216;

import java.util.HashMap;
import java.util.Map;

import map.Conta;
import map.ContaCorrente;

public class TesteMapa {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		c1.depositar(10000);

		Conta c2 = new ContaCorrente();

		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		Conta contaDoGerente = mapaDeContas.get("diretor");
		System.out.println(contaDoGerente.getSaldo());

	}

}
