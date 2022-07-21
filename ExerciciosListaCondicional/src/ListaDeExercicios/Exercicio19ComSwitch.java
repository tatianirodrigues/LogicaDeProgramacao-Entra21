package ListaDeExercicios;

import java.util.Scanner;

public class Exercicio19ComSwitch {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double preço, total;

		int pagamento;

		System.out.println("Preço do produto");
		preço = entrada.nextDouble();

		System.out.println("Forma de pagamento");
		pagamento = entrada.nextInt();

		switch(pagamento) {
		case 1:
			total = preço * 0.9;
			System.out.println("valor a ser pago: R$" + total);
			break;

		case 2:
			total = preço * 0.85;
			System.out.println("valor a ser pago: R$ " + total);
			break;

		case 3:
			total = preço/2;
			System.out.println("valor a ser pago: 2 vezes de R$" + total);
			break;

		case 4:
			total = (preço * 0.9)/2;
			System.out.println("valor a ser pago: 2 vezes de R$" + total);
			break;

		default:
			System.out.println("Número invalido");
		}
	}

}
