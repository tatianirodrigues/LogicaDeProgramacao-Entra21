/**
 * 
 */
package ListaDeExercicios;


import java.util.Scanner;

// Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80 km/h,
//mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$ 7,00 por
//cada km acima do limite. Exemplo: Dado o número: 100, o sistema deve mostrar a
//msg: 

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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