/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double preço, pagamento, total;

		System.out.println("Preço do produto");
		preço = entrada.nextDouble();

		System.out.println("Forma de pagamento");
		pagamento = entrada.nextDouble();

		if (pagamento == 1) {
			total = preço * 0.9;
			System.out.println("valor a ser pago: R$" + total);
		}
		else if (pagamento == 2) {
			total = preço * 0.85;
			System.out.println("valor a ser pago: R$ " + total);
		}
		else if (pagamento ==3) {
			total = preço/2;
			System.out.println("valor a ser pago: 2 vezes de R$" + total);
		}
		else if (pagamento ==4) {
			total = (preço * 0.9)/2;
			System.out.println("valor a ser pago: 2 vezes de R$" + total);
		}
		else {
			System.out.println("Número invalido");
		}


	}

}