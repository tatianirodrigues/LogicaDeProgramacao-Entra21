/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um programa que lê 10 números inteiros do teclado e armazene em uma lista. Ao final imprima a lista armazenada.

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros [] = new int [10];
		
		for(int i=0; i < numeros.length; i ++) {
		System.out.println("Digite um numero:");
		numeros [i] = entrada.nextInt();
		}
		
		for(int i = 0; i < numeros.length; i ++) { //pra varrer tem que usar for 
			System.out.print("Numero" + (i+1)  +": " + numeros[i] + ", "); //sem o 'ln' nao pula linha na hora de imprimir 
		}
	}

}
