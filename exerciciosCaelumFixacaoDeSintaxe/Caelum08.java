package exerciciosCaelumFixacaoDeSintaxe;

public class Caelum08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// tabela do 1 ao 5 usando fors encadeados:
		int linhas = 5;

		for (int i = 1; i <= linhas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j*i+" ");
			}
		 System.out.println();
		}
	}

}
