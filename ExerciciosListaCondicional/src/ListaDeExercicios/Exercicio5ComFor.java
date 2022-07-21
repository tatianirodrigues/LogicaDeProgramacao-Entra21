/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio5ComFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		String resposta;

		int nSim = 0, nNao = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Você gostou do produto? (sim ou nao)");
			resposta = entrada.nextLine();
			if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("s") ) {
				nSim ++;
			}
			else {
				nNao ++;
			}
		}
		System.out.println("Quantidade de Sim:" + nSim + "\nQuantidade de Não:" + nNao);
	}
}
