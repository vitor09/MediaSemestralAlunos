import java.util.Scanner;

public class MediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSemestre = 0;
		int prova = 0;
		int projeto = 0;
		int exercicios = 0;
		int contribuicao = 0;
		int totalProvas = 0;
		int totalProjetos = 0;
		int totalExercicios = 0;
		int totalContribuicao = 0;
		int somaBimestre = 0;
		Scanner sc = new Scanner(System.in);

		for (int bimestre = 0; bimestre < 3; bimestre++) {
			{

				System.out.print("Digite a nota da prova: ");
				prova = sc.nextInt();
				System.out.print("Digite a nota da projeto: ");
				projeto = sc.nextInt();
				System.out.print("Digite a nota dos exerc�cios: ");
				exercicios = sc.nextInt();
				System.out.print("Digite a nota das contribui��o em "
						+ "projetos de software livre/ conclus�o de MOOCs recomendados pelo docente: ");
				contribuicao = sc.nextInt();

				// int somaNotas = prova+projeto+exercicios+contribuicao;
				// totalSemestre = totalSemestre+somaNotas;
				totalProvas = totalProvas + prova;
				totalProjetos = totalProjetos + projeto;
				totalExercicios = totalExercicios + exercicios;
				totalContribuicao = totalContribuicao + contribuicao;

			}

			somaBimestre = (totalProvas / 3) + (totalProjetos / 3) + 
					(totalExercicios / 2) + (totalContribuicao / 3);
		}
		totalSemestre = somaBimestre / 3;
		System.out.println("A m�dia do aluno � " + totalSemestre + ".");
		sc.close();
		if(totalSemestre >= 8) {
			System.out.println("Aluno Aprovado!");
		} else {
			System.out.println("Aluno Reprovado!");
			System.out.println("A nota necess�ria para aprova��o na prova final �: " +
			(10 - totalSemestre) + "!");
		}
	}

}
