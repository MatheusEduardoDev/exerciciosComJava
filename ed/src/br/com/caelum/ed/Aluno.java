package br.com.caelum.ed;

import java.util.List;

public class Aluno {

	private String nome;
	private String[] aluno;

	public Aluno() {
		aluno = new String[10];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getAluno(int i) {
		System.out.println(aluno[i]);
	}

	public void add(String nome, int posiçao) {
		aluno[posiçao] = nome;

	}

	public void verificadorDeAluno(String s) {
		boolean b = false;
		for (int i = 0; i < aluno.length; i++) {
			if (s.equals(aluno[i])) {
				System.out.println("aluno " + aluno[i] + " esta na lista !!");
				b = true;
			}
		}
		if (!b) {
			System.out.println("aluno " + s + " nao esta na lista");
		}
	}

	public void removerAluno(int i) {
		aluno[i] = null;
	}

	public void alunosArmazenados() {
		int alunos = 0;
		for (int i = 0; i < aluno.length; i++) {
			if (aluno[i] != null) {
				alunos++;
			}
		}
		System.out.println("quantidade de alunos: " + alunos);

	}

	public int size() {

		return aluno.length;

	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public boolean equals(Object o) {
		Aluno outro = (Aluno) o;
		return this.nome.equals(outro.nome);
	}

}
