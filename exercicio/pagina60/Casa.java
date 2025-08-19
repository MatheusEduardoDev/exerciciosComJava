package exercicio.pagina60;

import java.util.Scanner;

public class Casa {

	// atributos
	String cor;
	boolean porta1 = false;
	boolean porta2 = false;
	boolean porta3 = false;
	int portasAbertas;

	void pintar(String s) {
		cor = s;
		System.out.println();
	}

	int quantasPortasEstaoAbertas() {
		if (porta1 == true) {
			portasAbertas += 1;
		}
		if (porta2 == true) {
			portasAbertas += 1;
		}
		if (porta3 == true) {
			portasAbertas += 1;
		}
		System.out.println("A " + portasAbertas + " porta(s) aberta(s) !!!");
		return portasAbertas = 0;
	}

	public static void main(String[] args) {
		Casa c = new Casa();

		Scanner sc = new Scanner(System.in);

		int x = 0;

		c.cor = "verde";
		boolean ligado = true;
		boolean inicio = true;
		boolean continuarEditando = true;
		boolean editar = true;

		while (ligado) {

			while (inicio) {
				continuarEditando = true;
				editar = true;

				System.out.println("cor da Casa: " + c.cor);
				if (c.porta1 == false) {
					System.out.println("primeira porta FECHADA !!!  ");
				} else {
					System.out.println("primeira porta ABERTA !!!  ");

				}
				if (c.porta2 == false) {
					System.out.println("segunda porta FECHADA !!! ");
				} else {
					System.out.println("segunda porta ABERTA !!!  ");

				}
				if (c.porta3 == false) {
					System.out.println("terceira porta FECHADA !!!  ");
				} else {
					System.out.println("terceira porta ABERTA !!! ");

				}

				c.quantasPortasEstaoAbertas();
				System.out.println();

				System.out.println("Continuar editando a casa: (1-sim)(2-nao)");
				x = sc.nextInt();

				while (continuarEditando) {
					if (x == 1) {
						continuarEditando = false;
					}
					if (x == 2) {
						System.out.println("Encerrar programa (1-sim)(2-nao)");
						x = sc.nextInt();
						if (x == 1) {
							ligado = false;
							inicio = false;
							continuarEditando = false;
							editar = false;
						}
						if (x == 2) {
							continuarEditando = false;
							editar = false;
						}
					}
					if (x < 1 || x > 2) {
						System.out.println("Numero INVALIDO !!!");
						System.out.println("Digite novamente: ");
						x = sc.nextInt();

					}
				}
				while (editar) {
					System.out.println("Digite para: ");
					System.out.println("1-Mudar cor da Casa: ");
					if (c.porta1 == false) {
						System.out.println("2-Para ABRIR a primeira porta:  ");
					} else {
						System.out.println("2-Para FECHAR a primeira porta:  ");

					}
					if (c.porta2 == false) {
						System.out.println("3-Para ABRIR a segunda porta:  ");
					} else {
						System.out.println("3-Para FECHAR a segunda porta:  ");

					}
					if (c.porta3 == false) {
						System.out.println("4-Para ABRIR a terceira porta:  ");
					} else {
						System.out.println("4-Para FECHAR a terceira porta:  ");

					}
					System.out.println("5-Encerrar programa:  ");
					x = sc.nextInt();

					if (x < 1 || x > 5) {
						boolean numeroInvalido = true;
						while (numeroInvalido) {
							if (x < 1 || x > 2) {
								System.out.println("Numero INVALIDO !!!");
								System.out.println("Digite novamente: ");
								x = sc.nextInt();

							} else {
								numeroInvalido = false;
							}
						}
					}
					if (x == 1) {
						System.out.println("Digite uma Nova cor da casa: ");
						c.pintar(sc.next());
						editar = false;

					}
					if (x == 2) {
						if (c.porta1 == false) {
							c.porta1 = true;
							editar = false;

						} else {
							c.porta1 = false;
							editar = false;

						}
					}
					if (x == 3) {
						if (c.porta2 == false) {
							c.porta2 = true;
							editar = false;

						} else {
							c.porta2 = false;
							editar = false;

						}
					}
					if (x == 4) {
						if (c.porta3 == false) {
							c.porta3 = true;
							editar = false;

						} else {
							c.porta3 = false;
							editar = false;

						}
					}

					if (x == 5) {
						ligado = false;
						editar = false;
						inicio = false;

					}

				}
			}
		}
		System.out.println("encerrando...");
	}
}
