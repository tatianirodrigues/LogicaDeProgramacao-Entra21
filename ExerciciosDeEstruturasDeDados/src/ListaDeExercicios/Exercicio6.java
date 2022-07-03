/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String [] signos = new String [12];
		int ano, resto;
		
		signos [0] = "Macaco";
		signos [1]= "Galo";
		signos [2]= "Cao";
		signos [3]= "Porco";
		signos [4]= "Rato";
		signos [5]= "Boi";
		signos [6]= "Tigre";
		signos [7]= "Coelho";
		signos [8]= "Dragao";
		signos [9]= "Serpente";
		signos [10]= "Cavalo";
		signos [11]= "Carneiro";
		
		System.out.println("Digite seu ano de nascimento:");
		ano = entrada.nextInt();
		resto = ano % 12;
		
		for (int i = 0; i < signos.length; i++) {
			
			if (resto == i) {
				System.out.println("Seu signo chines e: " + signos [i]);
			}
		}
		
		
		
		
	}

}

