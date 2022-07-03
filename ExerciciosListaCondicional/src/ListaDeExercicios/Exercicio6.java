/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Calcule a média dos alunos e indique se ele está aprovado ou reprovado. Permita que
//este aluno faça exame para poder ser aprovado. a)4 notas bimestrais b) Média para aprovação = 7,0
//c) Média para aprovação para Exame = 6,0
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
		
		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, nota3, nota4, media, notaExame;
		
		System.out.println("Nota1:");
		nota1 = entrada.nextDouble();
		System.out.println("Nota2:");
		nota2 = entrada.nextDouble();
		System.out.println("Nota3:");
		nota3 = entrada.nextDouble();
		System.out.println("Nota4:");
		nota4 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
			if (media >= 7) {
				System.out.println("APROVADO!");
			}
			else {
				System.out.println("REPROVADO. fazer exame"+ "\nNota Exame:");
				notaExame = entrada.nextDouble();
					if (notaExame >= 6) {
						System.out.println("APROVADO!");
					}
					else {
						System.out.println("REPROVADO");
					}
				
			}
		
	}

}
