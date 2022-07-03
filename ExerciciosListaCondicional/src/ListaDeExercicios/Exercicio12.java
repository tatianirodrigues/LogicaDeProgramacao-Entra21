/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Crie um algoritmo que leia um valor e a partir disso faça:
//(1) se for um valor negativo, mostre o módulo (valor sem sinal) do valor;
//(2) se for um valor maior do que 10, solicite outro valor e mostre a diferença entre eles; 
//(3) Caso o valor não seja de nenhuma condição anterior, mostre o valor dividido por 5.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		double n, n2, resultado;
		
		System.out.println("Numero:");
		n = entrada.nextDouble();
		
			if(n < 0) {
				resultado = n * (-1);
			}
			else if (n > 10) {
				System.out.println("Segundo numero:");
				n2 = entrada.nextDouble();
				resultado = n - n2;
			}
			else {
				resultado = n/5;
			}
		System.out.println("Resultado: " + resultado);
	}

}
