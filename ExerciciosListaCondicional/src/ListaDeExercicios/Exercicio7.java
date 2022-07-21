/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		double kgMorango, kgMaca, valorPago, kgFrutas, valor2;

		System.out.println("Quantos kg de morango foram comprados?");
		kgMorango = entrada.nextDouble();
		System.out.println("Quantos kg de maça foram comprados?");
		kgMaca = entrada.nextDouble();

		kgFrutas = kgMorango + kgMaca;

		if ( kgFrutas <= 5 ) {
			valorPago = (kgMorango * 2.5) + (kgMaca * 1.8);
		}
		else if ( kgFrutas > 5 && kgFrutas <= 8) {
			valorPago = (kgMorango * 2.2) + (kgMaca * 1.5);
		}
		else {
			valor2 = (kgMorango * 2.2) + (kgMaca * 1.5);
			valorPago = valor2 * 0.9;
		}

		System.out.println("Valor a ser pago: R$ " + valorPago );
	}

}