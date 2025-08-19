package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Conta {

}

class ContaFuncionario {

	// atributos
	String nomeFuncionario;
	String setorFuncionario;
	double salarioFuncionario;
	String dataDeEntradaDoBanco;
	String rg;
	boolean funcionarioNaEmpresa;
	String senha;
	String numeroDaConta;

	// construtor
	public ContaFuncionario(String nome, String setor, double salario, String data, String rg, boolean empresa,
			String senha, String numeroDaConta) {
		this.nomeFuncionario = nome;
		this.setorFuncionario = setor;
		this.salarioFuncionario = salario;
		this.dataDeEntradaDoBanco = data;
		this.rg = rg;
		this.funcionarioNaEmpresa = empresa;
		this.senha = senha;
		this.numeroDaConta = numeroDaConta;
	}

	// bonifica
	void bonifica(double quantidade) {
		this.salarioFuncionario += quantidade;
	}

	// Demite
	void demite() {
		this.funcionarioNaEmpresa = false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<ContaFuncionario> contasFuncionario = new ArrayList();

		
		int numeroConta = 1;
		
		// variavel para receber numero de cada conta criada... usei na Linha 163 ate
		// Linha 176
		String numeroDaConta = null;

		// variavel para receber as posiçoes de cada conta digitada na linha 251 e usada
		// na linha 273
		int numberList = 0;

	
		boolean criarSenha = true;

		// aqui senha nao recebe valor nenhum, mais vai recebe na Linha 134
		String senha = null;

		// primeira conta de um funcionario ativo
		String f1nomeFuncionario = "julio Cesar";
		String f1setorFuncionario = "atendente do banco";
		double f1salarioFuncionario = 1750;
		String f1dataDeEntradaDoBanco = "11/10/2023";
		String f1rg = "12345-6";
		Boolean ativoNaEmpresa = true;
		String senha1 = "0101";
		String numeroDaConta1 = "0001";

		contasFuncionario.add(new ContaFuncionario(f1nomeFuncionario, f1setorFuncionario, f1salarioFuncionario,
				f1dataDeEntradaDoBanco, f1rg, ativoNaEmpresa, senha1, numeroDaConta1));

		boolean apagarConta = true;
		
		double comissao = 0;

		boolean ligado = true;

		int y = 0;
		while (ligado) {
			System.out.println();
			System.out.println("1-Digite para acessar uma conta: ");
			System.out.println("2-Digite para criar uma nova conta: ");
			System.out.println("3-Digite para encerrar o programa: ");

			String x;
			y = sc.nextInt();

			if (y < 1 || y > 3) {
				System.out.println("Digite novamente um valor valido: ");
				System.out.println();
			}

			if (y == 3) {
				ligado = false;
			}
			if (y == 2) {

				System.out.println();
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Setor que atua: ");
				String setor = sc.next();
				System.out.println("Salario: ");
				double salario = sc.nextDouble();
				System.out.println("Dia que começou a trabalhar: ");
				String dataDeEntradaDoBanco = sc.next();
				System.out.println("RG: ");
				String rg = sc.next();
				boolean funcionarioNaEmpresa = true;

				System.out.println();

				criarSenha = true;
				while (criarSenha) {
					System.out.println("Criar senha: ");
					senha = sc.next();
					if (senha.length() == 4) {
						System.out.println("Confirmar senha: ");
						String confirmarSenha = sc.next();
						if (senha.equals(confirmarSenha)) {

							System.out.println("Conta criada !!!!");
							System.out.println();
							criarSenha = false;
						} else {
							System.out.println("Senhas não são iguais!!!");
							System.out.println("senha: " + senha);
							System.out.println("confirmar senha: " + confirmarSenha);
							System.out.println("Digite a senha novamente: ");
							System.out.println();

						}
					} else {
						System.out.println("sua Senha tem que ter pelo menos 4 Digitos: ");
					}
				}

				
					

				if (contasFuncionario.size() < 1000) {
					
					numeroDaConta = String.format("%04d", contasFuncionario.size()+1);
					System.out.println();
				
					
					// conta Criada !!!
					contasFuncionario.add(new ContaFuncionario(nome, setor, salario, dataDeEntradaDoBanco, rg,
							funcionarioNaEmpresa, senha, numeroDaConta));

					ContaFuncionario c = contasFuncionario.get(contasFuncionario.size() - 1);
					System.out.println("Nome: " + c.nomeFuncionario);
					System.out.println("Setor: " + c.setorFuncionario);
					System.out.println("Salario: " + c.salarioFuncionario);
					System.out.println("Data de Entrada no Banco: " + c.dataDeEntradaDoBanco);
					System.out.println("RG: " + c.rg);
					if (c.funcionarioNaEmpresa == true) {
						System.out.println("Funcionario ATIVO!!!!");
					} else {
						System.out.println("Funcionario DEMITIDO!!!");
					}
					System.out.println("numero da Conta: " + c.numeroDaConta);
				}
			}

			if (contasFuncionario.size() == 0) {
				System.out.println("voce nao possui contas !!! ");
				System.out.println("1-Voltar ao inicio: ");
				System.out.println("2-Encerrar programa: ");
				x = sc.next();

				while (!x.equals("1") && !x.equals("2")) {
					System.out.println("Digite somente: ");
					System.out.println("1-Voltar ao inicio: ");
					System.out.println("2-Encerrar o Programa: ");
					x = sc.next();
				}

				if (x.equals("1")) {
					y = 0;

				}
				if (x.equals("2")) {
					ligado = false;
					y = 0;
				}
			}

			if (y == 1) {

				System.out.println();
				System.out.println("numero da conta (xxxx): ");
				System.out.println("numero da primeira conta criada e (0001): ");
				x = sc.next();

			
				String[] vetorNumeroContas = new String[contasFuncionario.size()];
				for (int i = 0; i < contasFuncionario.size(); i++) {
					ContaFuncionario p = contasFuncionario.get(i);
					vetorNumeroContas[i] = p.numeroDaConta;
				}

			
				boolean accontsNumber = true;
				while (accontsNumber) {
					for (int i = 0; i < contasFuncionario.size(); i++) {
						if (x.equals(vetorNumeroContas[i])) {
							numberList = i;
							accontsNumber = false;

						}
					}
					if (accontsNumber) {

						System.out.println("Este Numero de Conta não existe Digite novamente: ");
						x = sc.next();
					}

				}

				System.out.println();
				System.out.println("Digite a senha para acessar a Conta: ");
				System.out.println("Senha da primeira conta: ");
				System.out.println("(0001) = 0101: ");
				x = sc.next();
				boolean conta1 = true;
				
				ContaFuncionario s = contasFuncionario.get(numberList);

				boolean senhaCorreta = true;
				while (senhaCorreta)
					if (x.equals(s.senha)) {
						senhaCorreta = false;
					} else {
						System.out.println("Senha Incorreta Digite Novamente: ");
						x = sc.next();
					}

				while (conta1) {
					ContaFuncionario f1 = contasFuncionario.get(numberList);
					System.out.println("Nome: " + f1.nomeFuncionario);
					System.out.println("Setor: " + f1.setorFuncionario);
					System.out.println("Salario: " + f1.salarioFuncionario);
					System.out.println("Data de Entrada no Banco: " + f1.dataDeEntradaDoBanco);
					System.out.println("RG: " + f1.rg);
					if (f1.funcionarioNaEmpresa == true) {
						System.out.println("Funcionario ATIVO!!!!");
					} else {
						System.out.println("Funcionario DEMITIDO!!!");
					}

					System.out.print("Bonificação: ");
					System.out.println(comissao);
					System.out.println("Numero da Conta: " + f1.numeroDaConta);

					System.out.println();

					System.out.println("1-Editar Conta: ");
					System.out.println("2-Voltar Inicio: ");
					x = sc.next();

					while (!x.equals("1") && !x.equals("2")) {
						System.out.println("Digite somente: ");
						System.out.println("1-Para editar Conta: ");
						System.out.println("2-Para voltar ao inicio: ");
						x = sc.next();
					}
					if (x.equals("2")) {
						conta1 = false;
					}
					if (x.equals("1")) {
						System.out.println("digite para editar: ");
						System.out.println();
						System.out.println("1-Nome: " + f1.nomeFuncionario);
						System.out.println("2-Setor que atua: " + f1.setorFuncionario);
						System.out.println("3-Salario: " + f1.salarioFuncionario);
						System.out.println("4-Dia que começou a trabalhar: " + f1.dataDeEntradaDoBanco);
						System.out.println("5-RG: " + f1.rg);
						if (f1.funcionarioNaEmpresa == true) {
							System.out.println("6-Demitir Funcionario: ");
						}
						if (f1.funcionarioNaEmpresa == false) {
							System.out.println("6-Ativar Funcionario: ");
						}
						System.out.println("7-Bonificação: ");

						x = sc.next();

						boolean editar = true;
						int n = Integer.parseInt(x);

						while (editar) {
							while (n <= 0 || n > 7) {
								System.out.println("Valor invalido !! Digite Novamente: ");
								System.out.println("Somente valores validos 1/2/3/4/5/6/7 ");
								n = sc.nextInt();
								if (n > 0 && n <= 7) {
									x = String.valueOf(n);
								}
							}
							if (x.equals("1")) {
								System.out.println("Novo Nome: ");
								f1.nomeFuncionario = sc.next();
							}
							if (x.equals("2")) {
								System.out.println("Novo Setor: ");
								f1.setorFuncionario = sc.next();
							}
							if (x.equals("3")) {
								System.out.println("Novo Salario: ");
								f1.salarioFuncionario = sc.nextDouble();
							}
							if (x.equals("4")) {
								System.out.println("Dia que começou a trabalhar: ");
								f1.dataDeEntradaDoBanco = sc.next();
							}
							if (x.equals("5")) {
								System.out.println("RG: ");
								String rg = sc.next();
							}
							if (x.equals("6") && f1.funcionarioNaEmpresa == true) {
								System.out.println("Demitir Funcionario: ");
								System.out.println("1-sim");
								System.out.println("2-nao");
								x = sc.next();
								if (x.equals("1")) {
									f1.demite();
								}

								 apagarConta = true;
								while (!f1.funcionarioNaEmpresa && apagarConta == true) {
									System.out.println("Deseja apagar a Conta existente ?? ");
									System.out.println("1-sim / 2-nao: ");
									x = sc.next();

									while (!x.equals("1") && !x.equals("2")) {
										System.out.println("Digite somente: ");
										System.out.println("1-Para apagar a conta do Funcionario: ");
										System.out.println("2-Para deixar a conta do Funcionario: ");
										x = sc.next();
									}

									if (x.equals("1")) {
										contasFuncionario.remove(numberList);
										editar = false;
										conta1 = false;
										apagarConta = false;
									}
									if (x.equals("2")) {
										apagarConta = false;

									}
								}
							}

							if (x.equals("6") && f1.funcionarioNaEmpresa == false) {
								System.out.println("6-Ativar Funcionario: ");
								System.out.println("1-sim");
								System.out.println("2-nao");
								x = sc.next();

								if (x.equals("1")) {
									f1.funcionarioNaEmpresa = true;
								}

								while (!f1.funcionarioNaEmpresa && apagarConta == true) {
									System.out.println("Deseja apagar a Conta existente ?? ");
									System.out.println("1-sim / 2-nao: ");
									x = sc.next();

									while (!x.equals("1") && !x.equals("2")) {
										System.out.println("Digite somente: ");
										System.out.println("1-Para apagar a conta do Funcionario: ");
										System.out.println("2-Para deixar a conta do Funcionario: ");
										x = sc.next();
									}

									if (x.equals("1")) {
										contasFuncionario.remove(numberList);
										editar = false;
										conta1 = false;
										apagarConta = false;

									}
									if (x.equals("2")) {
										apagarConta = false;

									}

								}
							}
							if (x.equals("7")) {
								System.out.println("Digite o valor da bonificação: ");
								comissao = f1.salarioFuncionario;
								f1.bonifica(sc.nextDouble());
								comissao = f1.salarioFuncionario - comissao;

							}
							if (conta1) {
								System.out.println("1-Continuar Editando: ");
								System.out.println("2-voltar para as informacoes da conta: ");
								x = sc.next();
							}

							while (!x.equals("1") && !x.equals("2")) {
								System.out.println("Digite somente: ");
								System.out.println("1-Para Continuar Editando: ");
								System.out.println("2-Para voltar as informacoes da conta: ");
								x = sc.next();
							}
							if (!conta1) {
								System.out.println("1-voutar ao inicio: ");
								System.out.println("2-Encerrar programa: ");
								x = sc.next();

							}
							while (!x.equals("1") && !x.equals("2")) {
								System.out.println("Digite somente: ");
								System.out.println("1-Para Voltar ao inicio: ");
								System.out.println("2-Encerrar o programa: ");
								x = sc.next();
							}
							if (x.equals("1")) {
								break;
							}
							if (x.equals("2") && apagarConta == true) {
								ligado = false;
							}
							// continuar editando
							if (x.equals("1")) {
								System.out.println("digite para editar: ");
								System.out.println();
								System.out.println("1-Nome: " + f1.nomeFuncionario);
								System.out.println("2-Setor que atua: " + f1.setorFuncionario);
								System.out.println("3-Salario: " + f1.salarioFuncionario);
								System.out.println("4-Dia que começou a trabalhar: " + f1.dataDeEntradaDoBanco);
								System.out.println("5-RG: " + f1.rg);
								if (f1.funcionarioNaEmpresa == true) {
									System.out.println("6-Demitir Funcionario: ");
								}
								if (f1.funcionarioNaEmpresa == false) {
									System.out.println("6-Ativar Funcionario: ");
								}
								System.out.println("7-Depositar mais Bonificação: " + comissao);
								x = sc.next();

							}

							// finalizar ediçoes
							if (x.equals("2")) {
								editar = false;
							}

						}

					}
				}
			}

		}
		System.out.println("encerrando...");

	}

}
