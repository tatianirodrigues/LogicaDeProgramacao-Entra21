/**
 * 
 */
package ListaDeExercicios;


import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner entrada = new Scanner (System.in);

		int velocidade, multa;

		System.out.println("Qual a sua velocidade?");

		velocidade = entrada.nextInt();

		if (velocidade > 80) {
			multa = 7*(velocidade - 80);
			System.out.println("MULTADO! Você excedeu o limite permitido que é de 80Km/h. \nVocê deve pagar uma multa de R$ " + multa);
		}
		else {
			System.out.println("Muito bem! Tudo certo! Dirija com segurança!");
		}
	}

}