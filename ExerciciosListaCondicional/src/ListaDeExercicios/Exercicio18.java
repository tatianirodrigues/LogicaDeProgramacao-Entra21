/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */

public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double peso, altura, imc, quadrado;

		System.out.println("Peso:");
		peso = entrada.nextDouble();

		System.out.println("altura em metros");
		altura = entrada.nextDouble();

		quadrado = altura * altura;

		imc = peso/quadrado;

		if (imc < 18.5) {
			System.out.println( imc + " abaixo");
		}
		else if (imc < 25 && imc >= 18.5) {
			System.out.println(imc + " peso normal");
		}
		else if (imc < 30 && imc >= 25) {
			System.out.println(imc + " acima do peso");
		}
		else {
			System.out.println(imc + " obeso");
		}
	}

}