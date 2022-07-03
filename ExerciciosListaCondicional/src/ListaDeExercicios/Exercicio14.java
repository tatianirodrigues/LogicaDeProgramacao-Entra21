/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Crie um algoritmo que leia um valor e a partir disso faça: (1) se o valor for 1 e 2, mostre o valor elevado ao cubo;
//(2) se o valor for múltiplo de 3 mostre o fatorial desse número; 
//(3) se o valor for os valores 4, 5, 7 ou 8, mostre o valor dividido 9.
//Caso não seja nenhum dos valores, informe como “valor inválido”.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
