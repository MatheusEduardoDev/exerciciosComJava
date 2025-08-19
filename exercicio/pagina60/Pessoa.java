package exercicio.pagina60;

public class Pessoa {

	// atributos
	String nome;
	int idade;
	int aniversario = 1;

	// metodo
	void fazAniversario() {
		this.idade += aniversario;

	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "livia";
		p.idade = 15;
		int ano = 2023;

		for (int i = 0; p.idade <= 18; i++) {
			System.out.println("Nome: " + p.nome);
			System.out.println("idade: " + p.idade + " ano: " + ano);
			p.fazAniversario();
			ano++;
		}
	}
}
