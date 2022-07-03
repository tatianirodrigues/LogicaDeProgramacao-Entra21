/**
 * 
 */
package ListaDeExercicios;

import java.util.Scanner;

//Faça um Programa que peça as quatro notas de 10 alunos,
//calcule e armazene num vetor a média de cada aluno,
//imprima o número de alunos com média maior ou igual a 7.0.
/**
 * @author tatianirodrigues
 *
 */
public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] notasAlunos = new double[3][4]; // com 10 alunos da problema 
		
		double[] soma = new double [3];
		double[] media = new double [3];
		
		for(int i = 0; i< notasAlunos.length; i++) {
			
			for(int j =0; j< notasAlunos[i]. length; j++) {
				System.out.println("Digite a nota " + (j+1) + " do aluno " + (i + 1));
				notasAlunos [i][j] = entrada.nextDouble();
				soma[i] += notasAlunos[i][j];
				media [i] = soma [i]/4;
			}
		}
	
		for(int i = 0; i < media.length; i++) { 
			System.out.print("Media do Aluno" + (i + 1)  +": " + media[i] + ", "); 
		}
		
		for(int i = 0; i < media.length; i++) { 
			
			if (media[i] >= 7) {
				System.out.print("\nAluno " + (i+1) + " Aprovado :)");
		
			}
		}
		
	}

}
