/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double resposta, a, numero, fatorial = 1;

		System.out.println("Digite um numero:");
		numero = entrada.nextDouble();

		if(numero == 1 || numero == 2) {
			resposta = Math.pow(numero, 3);
			System.out.println("Resultado: " + resposta);
		}
		else if (numero%3 == 0 ) {
			for (int i = 1; i <= numero; i++) {
				fatorial = fatorial * i;
			}
			System.out.println("Resultado: " + fatorial);
		}
		else if(numero == 4 ||numero == 5 || numero == 7 || numero == 8) {
			resposta = numero / 9;
			System.out.println("Resultado: " + resposta);
		}
		else {
			System.out.println("Valor invalido");
		}
	}

}
