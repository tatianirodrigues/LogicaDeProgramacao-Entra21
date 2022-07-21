/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

/**
 * @author tatianirodrigues
 *
 */
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		String nome;
		float nota1, nota2, frequencia, media;

		System.out.println("Nome do aluno:");
		nome = entrada.nextLine();

		System.out.println("Nota 1:");
		nota1 = entrada.nextFloat();
		System.out.println("Nota 2:");
		nota2 = entrada.nextFloat();

		media = (nota1 + nota2)/2;

		System.out.println("Frequência do aluno (sem %):");
		frequencia = entrada.nextFloat();

		if (media >= 6 && frequencia >= 70) {
			System.out.println("APROVADO!");
		}
		else{
			System.out.println("REPROVADO :(");
		}
	}

}
