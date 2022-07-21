/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner entrada = new Scanner (System.in);

		float salario, nFilhos, somaSalario = 0, somaFilhos=0;
		float mediaFilhos = 0, mediaSalario = 0, maiorSalario = 0, menor150 = 0, porcentagemMenor150 = 0;

		int i;

		for (i = 0; i < 5; i++) {

			System.out.println("Salario:");

			salario = entrada.nextFloat();
			somaSalario = somaSalario + salario;

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario < 150) {
				menor150++;
			}

			System.out.println("Numero de filhos:");

			nFilhos = entrada.nextFloat();
			somaFilhos = somaFilhos + nFilhos;
		}

		mediaSalario = somaSalario / i;
		mediaFilhos = somaFilhos/ i;
		porcentagemMenor150 = (menor150 * 100) / i;

		System.out.println("Media Salarios:" + mediaSalario + " R$\nMedia de Filhos:" + mediaFilhos + "\nMaior Salario:" + maiorSalario
				+ "R$\nPercentual de pessoas com salário menor que R$ 150,00:" + porcentagemMenor150 + "%");
	}

}
