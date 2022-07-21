/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner entrada = new Scanner (System.in);

		double resposta, a, numero;

		System.out.println("Digite um numero de 1 ate 9:");
		numero = entrada.nextDouble();

		if(numero == 1 || numero == 2 || numero == 3) {
			resposta = Math.pow(numero, 2);
			System.out.println("Resultado: " + resposta);
		}
		else if (numero == 4|| numero == 9) {
			resposta = Math.sqrt(numero);
			System.out.println("Resultado: " + resposta);
		}
		else if(numero == 6 || numero == 7 || numero == 8) {
			resposta = numero / 9;
			System.out.println("Resultado: " + resposta);
		}
		else {
			System.out.println("Numero invalido");
		}
	}

}
