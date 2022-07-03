/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Desenvolva um programa que pergunte a distância de uma viagem em Km. Calcule o
//preço da passagem, cobrando R$ 0,50 por Km para viagens de até 200Km e R$ R$ 0,45
//para viagens mais longas. Exemplo: Dada a distância 1000, o sistema deve mostrar a
//msg:
//Você está prestes a começar uma viagem de 1000.0Km.
//O preço da sua passagem será de R$ 450.00
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
		
		Scanner entrada = new Scanner (System.in);
		
		double distancia, valor;
		
		System.out.println("Qual a distância da sua viagem em Km?");
		distancia = entrada.nextDouble();
		
			if (distancia < 200) {
				valor = distancia * 0.5;
			}
			
			else {
				valor = distancia * 0.45;
			}
			
			System.out.println("Você está prestes a começar uma viagem de " + distancia + "Km" + "\nO preço da sua passagem será de R$" + valor);
	}
}

