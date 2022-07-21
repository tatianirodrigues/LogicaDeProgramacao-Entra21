/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		int ingressoEmpresa, idade, tempoEmpresa ;
		String nome;

		System.out.println("Nome:");
		nome = entrada.nextLine();

		System.out.println("Idade:");
		idade = entrada.nextInt();

		System.out.println("Tempo na empresa:");
		tempoEmpresa = entrada.nextInt();


		if (idade >= 65 || tempoEmpresa >=30 ) {
			System.out.println("Requerer aposentadoria");
		}
		else if (idade >= 60 && tempoEmpresa >=25) {
			System.out.println("Requerer aposentadoria");
		}
		else {
			System.out.println("Nao Requerer");
		}

	}

}
