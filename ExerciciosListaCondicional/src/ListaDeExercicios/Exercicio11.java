/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Crie um algoritmo que leia um valor e a partir disso faça: (1) se o valor for 1, 2 ou 3, mostre o valor elevado ao quadrado;
//(2) se o valor for o número 4 ou 9, mostre a raiz quadrada do número;
//(3) se for os valores 6, 7 e 8, mostre o valor dividido 9.

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		double resposta, a, numero;
		
		System.out.println("Digite um numero de 1 ate 9:");
		numero = entrada.nextDouble();
		
			if(numero == 1 || numero == 2 || numero == 3) {
				resposta = Math.pow(numero, 2);
				System.out.println("Resultado: " + resposta);
			}
			else if (numero == 4|| numero == 9) {
				resposta = Math.sqrt(numero);
				System.out.println("Resultado: " + resposta);
			}
			else if(numero == 6 || numero == 7 || numero == 8) {
				resposta = numero / 9;
				System.out.println("Resultado: " + resposta);
			}
			else {
				System.out.println("Numero invalido");
			}
	}

}
