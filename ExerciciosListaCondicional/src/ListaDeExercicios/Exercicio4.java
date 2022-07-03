/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Entrar com a idade de uma pessoa e informar: Se é maior de idade ou Se é menor de idade
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Qual a sua idade?");
		idade = entrada.nextInt();
		
			if (idade>= 18) {
				System.out.println("Você é maior de idade!");
			}
			else {
				System.out.println("Você é menor de idade!");
			}

	}

}