/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;


/**
 * @author tatianirodrigues
 *
 */
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		double n, n2, resultado;

		System.out.println("Numero:");
		n = entrada.nextDouble();

		if(n < 0) {
			resultado = n * (-1);
		}
		else if (n > 10) {
			System.out.println("Segundo numero:");
			n2 = entrada.nextDouble();
			resultado = n - n2;
		}
		else {
			resultado = n/5;
		}
		System.out.println("Resultado: " + resultado);
	}

}
