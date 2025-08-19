package exercicio.pagina60;

import java.util.Locale;
import java.util.Scanner;


public class Porta {

	// atributos
	boolean aberta;
	String cor;
	double dimençaoX;
	double dimençaoY;
	double dimençaoZ;

	void abre() {
		this.aberta = true;
	}

	void fecha() {
		this.aberta = false;
	}

	void pinta(String s) {
		this.cor = s;
		System.out.println("Cor da porta Alterada !!!");
		System.out.println("Cor atual : " + this.cor);
		System.out.println();

	}

	boolean estaAberta() {
		if (this.aberta == false) {
			System.out.println("Porta Fechada !!!");
			System.out.println();
			return false;
		} else {
			System.out.println("Porta Aberta !!!");
			System.out.println();
			return true;
		}

	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		String texto;

		Porta p = new Porta();

		boolean ligado = true;

		p.aberta = false;
		p.cor = "Marrom";
		// altura da porta
		p.dimençaoX = 2.1;
		// largura da porta
		p.dimençaoY = 0.90;
		// espessura da porta
		p.dimençaoZ = 3.5;

		while (ligado) {
			System.out.println("Cor da porta: " + p.cor);
			System.out.printf("Altura da porta: %.1f  M \n", p.dimençaoX);
			System.out.println("Largura da porta: " + p.dimençaoY + " C");
			System.out.println("Espessura da porta: " + p.dimençaoZ + " C");
			p.estaAberta();
			System.out.println();

			System.out.println("EDITAR PORTA (1-SIM)(2-NAO)");
			x = sc.nextInt();
			

			if (x == 1) {
				System.out.println("Digite para: ");
				System.out.println();
				System.out.println("1-Mudar cor: ");
				System.out.println("2-Mudar Altura: ");
				System.out.println("3-Mudar Largura: ");
				System.out.println("4-Mudar Espessura: ");
				if (p.aberta == false) {
					System.out.println("5-Abrir a porta: ");
				} else {
					System.out.println("5-Fechar a porta: ");
				}
				x = sc.nextInt();

				if (x == 1) {
					System.out.println("Digite a cor desejada: ");
					p.pinta(texto = sc.next());

				}
				if (x == 2) {
					System.out.println("Digite a nova altura da porta: ");
					p.dimençaoX = sc.nextDouble();
					System.out.println("Altura da porta atual: " + p.dimençaoX);
				}
				if (x == 3) {
					System.out.println("Digite a nova largura da porta: ");
					p.dimençaoY = sc.nextDouble();
					System.out.println("Largura da porta atual: " + p.dimençaoY);
				}
				if (x == 4) {
					System.out.println("Digite a nova espessura da porta: ");
					p.dimençaoZ = sc.nextDouble();
					System.out.println("Espessura atual: " + p.dimençaoZ);
				}

				if (x == 5) {
					if (p.aberta == false) {
						p.abre();
					} else {

						p.fecha();
					}
				}
			}

			
			if(x == 2) {
				System.out.println("Deseja encerrar o programa(1-sim)(2-nao)");
				x = sc.nextInt();
				
				if(x == 1) {
					ligado = false;
				}
				
			}
		}
	 System.out.println("encerrando...");
	}
}
