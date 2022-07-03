/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um Programa que leia 4 notas, mostre as notas e a
//média na tela.

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float notas [] = new float [4];
		float somaNotas = 0, media;
		
		for(int i = 0; i < notas.length; i++) {
		System.out.println("Digita Nota" + (i+1) + ":");
		notas [i] = entrada.nextInt();
		
		somaNotas += notas [i];
		
		}
		
		media = somaNotas/4;
	
		for(int i = 0; i < notas.length; i++) { 
		
		System.out.print("Nota" + (i + 1)  +": " + notas[i] + ", "); 
		
		}
		System.out.println("\nMedia:" + media);
	}

}
