/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;


/**
 * @author tatianirodrigues
 *
 */
public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		String resposta1, resposta2, resposta3, resposta4, resposta5;
		int nSim1, nSim2, nSim3, nSim4, nSim5, somaSim, somaNao;

		//Pessoa 1 
		System.out.println("Você gostou do produto?");
		resposta1 = entrada.nextLine();
		if (resposta1.equals("Sim") || resposta1.equals("sim") || resposta1.equals("s") ) {
			nSim1 = 1;
		}
		else {
			nSim1 = 0;
		}
		//Pessoa 2 
		System.out.println("Você gostou do produto?");
		resposta2 = entrada.nextLine();
		if (resposta2.equals("Sim") || resposta2.equals("sim") || resposta2.equals("s")) {
			nSim2 = 1;
		}
		else {
			nSim2 = 0;	
		}

		//Pessoa 3 
		System.out.println("Você gostou do produto?");
		resposta3 = entrada.nextLine();
		if (resposta3.equals("Sim")|| resposta3.equals("sim") || resposta3.equals("s")) {
			nSim3 = 1;
		}
		else {
			nSim3 = 0;
		}
		//Pessoa 4 
		System.out.println("Você gostou do produto?");
		resposta4 = entrada.nextLine();
		if (resposta4.equals("Sim") || resposta4.equals("sim") || resposta4.equals("s")) {
			nSim4 = 1;
		}
		else {
			nSim4 = 0;
		}
		//Pessoa 5
		System.out.println("Você gostou do produto?");
		resposta5 = entrada.nextLine();
		if (resposta5.equals("Sim")|| resposta5.equals("sim") || resposta5.equals("s")) {
			nSim5 = 1;
		}
		else {
			nSim5 = 0;
		}

		somaSim = nSim1 + nSim2 + nSim3 + nSim4 + nSim5;

		somaNao =  5 - somaSim;

		System.out.println("Quantidade de Sim:" + somaSim + "\nQuantidade de Não:" + somaNao);

	}

}
