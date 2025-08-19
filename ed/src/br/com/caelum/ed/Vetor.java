package br.com.caelum.ed;

public class Vetor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		aluno.add("aluno1", 9);

		aluno.getAluno(9);

		aluno.add("aluno2", 7);

		aluno.getAluno(7);

		aluno.removerAluno(7);

		aluno.getAluno(7);

		aluno.alunosArmazenados();

		aluno.verificadorDeAluno("aluno10");
		aluno.verificadorDeAluno("aluno1");
	}

}
