/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double distancia, valor;

		System.out.println("Qual a distância da sua viagem em Km?");
		distancia = entrada.nextDouble();

		if (distancia < 200) {
			valor = distancia * 0.5;
		}

		else {
			valor = distancia * 0.45;
		}

		System.out.println("Você está prestes a começar uma viagem de " + distancia + "Km" + "\nO preço da sua passagem será de R$" + valor);
	}
}

