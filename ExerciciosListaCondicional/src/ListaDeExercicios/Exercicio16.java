/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Número:");

		double n, resto;

		n = entrada.nextDouble();

		resto = n % 2;

		if (resto == 0) {
			System.out.println("O número é par");
		}

		else {
			System.out.println("O número ímpar");
		}	
	}

}