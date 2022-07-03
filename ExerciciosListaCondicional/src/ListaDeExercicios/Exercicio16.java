/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar
/**
* @author tatianirodrigues
*
*/
public class Exercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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