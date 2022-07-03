/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float numeros [] = new float [10];
		
		for(int i = 0; i < numeros.length; i++) {
		System.out.println("Digite um numero:");
		numeros [i] = entrada.nextInt();
		}
	
		for(int i = 9; i >= 0; i--) { 
		
		System.out.print("Numero" + (i + 1)  +": " + numeros[i] + ", "); 
	
		}
	}

}
