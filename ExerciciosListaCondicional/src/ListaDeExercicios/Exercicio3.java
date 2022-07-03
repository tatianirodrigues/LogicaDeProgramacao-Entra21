/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Ler o nome, 2 notas e a frequência de um aluno em uma disciplina e verificar se o
//aluno foi aprovado ou não, sabendo que para ser aprovado um aluno precisa ter média
//>= 6,0 e frequência > 70%.
/**
* @author tatianirodrigues
*
*/
public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
