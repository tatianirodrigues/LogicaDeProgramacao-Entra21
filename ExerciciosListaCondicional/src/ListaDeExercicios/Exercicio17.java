/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
import java.util.Scanner;
/**
 * @author guest01
 *
 */
public class Exercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Número 1 e número 2:");

		double A, B, C;

		A = entrada.nextDouble();
		B = entrada.nextDouble();

		if (A == B) {

			C = A + B;
		}

		else {

			C = A * B;
		}


		System.out.println("Valor de C: " + C);

	}

}
